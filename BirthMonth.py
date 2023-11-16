
group1 = set()
group2 = set()
self_birth_month = set()

for x in range(1, 4):

    month = input(f"Enter birth month {x}: ")

    group1.add(month)

for y in range(1, 4):

    month = input(f"Enter birth month {y}: ")

    group2.add(month)

print("Group 1:", group1)

print("Group 2:", group2)

user_birth_month = input("Enter your birth month: ")

self_birth_month.add(user_birth_month)

union_set = group1.union(group2)

intersection_set = group1.intersection(group2)

difference_set = group1.difference(group2)

self_birth_month.intersection_update(union_set)

print("Union:", union_set)

print("Intersection:", intersection_set)

print("Difference:", difference_set)

if self_birth_month:

    print("You have the same birth month with one of your classmates.")

else:

    print("You do not have the same birth month with any of your classmates.")