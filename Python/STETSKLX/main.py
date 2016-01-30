

N = 6
L = 2
R = 3

tests = [
    [1,3,3],
    [1,2,1],
    [2,4,1],
    [2,5,2],
    [3,6,2]
]

tree = [[] for i in range(N + 1)]
# for i in range(N + 1):
#     tree.append([])

def dfs(node, tree, L, R):
    print 'running DFS'
    depth = 0
    nodes_to_visit = [(node, 0, depth)]
    weights = []
    traversed = []
    while nodes_to_visit:
        current_node, current_weight, current_depth = nodes_to_visit.pop();
        print 'current_node: %s' % current_node

        while weights and weights[-1][2] >= current_depth:
            pw = weights.pop()
            traversed.pop()
            depth -= 1

        weights.append((current_node, current_weight, current_depth))
        traversed.append(current_node)
        depth += 1

        for connected_node, weight in tree[current_node]:
            if connected_node not in traversed:
                nodes_to_visit.append((connected_node, weight, depth + 1))

        # print 'nodes_to_visit %s' % nodes_to_visit
        print 'weights %s' % map(lambda x: x[0], weights)



for test in tests:
    node1 = test[0]
    node2 = test[1]
    weight = test[2]

    tree[node1].append((node2, weight))
    tree[node2].append((node1, weight))

print tree

for node, nodes in enumerate(tree[1]):
    dfs(node, tree, L, R)
