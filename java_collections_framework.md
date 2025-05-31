# Java Collections Framework - Complete Hierarchy

## 🌳 Visual Hierarchy Tree

```
📦 JAVA COLLECTIONS FRAMEWORK
│
├─── 🔄 Iterable<T> (Interface)
│    │
│    └─── 📋 Collection<E> (Interface)
│         │
│         ├─── 📝 List<E> (Interface) - Ordered, Allows Duplicates
│         │    ├─── ArrayList<E> - Resizable Array
│         │    ├─── LinkedList<E> - Doubly Linked List
│         │    └─── Vector<E> - Synchronized ArrayList
│         │         └─── Stack<E> - LIFO Stack (Legacy)
│         │
│         ├─── 🎯 Set<E> (Interface) - No Duplicates
│         │    ├─── HashSet<E> - Hash Table Based
│         │    │    └─── LinkedHashSet<E> - Maintains Insertion Order
│         │    │
│         │    └─── TreeSet<E> - Red-Black Tree (Sorted)
│         │         └─── implements NavigableSet<E>
│         │              └─── extends SortedSet<E>
│         │
│         ├─── 🚶 Queue<E> (Interface) - FIFO Operations
│         │    ├─── PriorityQueue<E> - Heap-based Priority Queue
│         │    ├─── LinkedList<E> - Also implements List & Deque
│         │    └─── ArrayDeque<E> - Resizable Array Implementation
│         │
│         └─── ⚡ Deque<E> (Interface) - Double-ended Queue
│              ├─── LinkedList<E> - Doubly Linked Implementation
│              └─── ArrayDeque<E> - Circular Array Implementation
│
├─── 🗺️ Map<K,V> (Interface) - Key-Value Pairs [NOT Collection subtype]
│    │
│    ├─── HashMap<K,V> - Hash Table Based
│    │    └─── LinkedHashMap<K,V> - Maintains Access/Insertion Order
│    │
│    ├─── TreeMap<K,V> - Red-Black Tree (Sorted by Keys)
│    │    └─── implements NavigableMap<K,V>
│    │         └─── extends SortedMap<K,V>
│    │
│    └─── Hashtable<K,V> - Synchronized HashMap (Legacy)
│         └─── Properties - String-to-String Hashtable
│
├─── 🔧 Extended Interfaces
│    │
│    ├─── SortedSet<E> extends Set<E>
│    ├─── NavigableSet<E> extends SortedSet<E>
│    ├─── SortedMap<K,V> extends Map<K,V>
│    └─── NavigableMap<K,V> extends SortedMap<K,V>
│
├─── 🎯 Iterator Interfaces
│    │
│    ├─── Iterator<E> - Forward iteration
│    ├─── ListIterator<E> - Bidirectional iteration for Lists
│    └─── Enumeration<E> - Legacy iterator interface
│
└─── 🛠️ Utility Classes
     │
     ├─── Collections - Static utility methods for collections
     └─── Arrays - Static utility methods for arrays
```

## 📊 Interface Hierarchy Summary

### Core Collection Interfaces
```
Iterable<T>
    └── Collection<E>
            ├── List<E>
            ├── Set<E>
            │   └── SortedSet<E>
            │       └── NavigableSet<E>
            ├── Queue<E>
            └── Deque<E>

Map<K,V> (Separate hierarchy)
    └── SortedMap<K,V>
        └── NavigableMap<K,V>
```

## 🎨 Implementation Classes Overview

| Interface | Implementations | Key Characteristics |
|-----------|----------------|-------------------|
| **List** | ArrayList, LinkedList, Vector, Stack | Ordered, indexed access, duplicates allowed |
| **Set** | HashSet, LinkedHashSet, TreeSet | No duplicates, unique elements |
| **Queue** | PriorityQueue, LinkedList, ArrayDeque | FIFO operations, element ordering |
| **Deque** | LinkedList, ArrayDeque | Double-ended queue operations |
| **Map** | HashMap, LinkedHashMap, TreeMap, Hashtable | Key-value associations |

## 🔍 Detailed Implementation Characteristics

### 📝 List Implementations
- **ArrayList**: 
  - ✅ Fast random access O(1)
  - ❌ Slow insertion/deletion O(n)
  - 💾 Dynamic array, good for read-heavy operations

- **LinkedList**: 
  - ✅ Fast insertion/deletion O(1)
  - ❌ Slow random access O(n)
  - 🔗 Doubly-linked list, implements List, Queue, Deque

- **Vector**: 
  - 🔒 Synchronized (thread-safe)
  - 📈 Legacy class, similar to ArrayList
  - ⚠️ Generally avoid in favor of ArrayList

- **Stack**: 
  - 📚 LIFO operations (push, pop, peek)
  - 🏗️ Extends Vector
  - ⚠️ Consider ArrayDeque for stack operations

### 🎯 Set Implementations
- **HashSet**: 
  - ⚡ O(1) average time complexity
  - 🎲 No ordering guarantee
  - 💡 Uses hash table

- **LinkedHashSet**: 
  - 📋 Maintains insertion order
  - ⚡ O(1) operations like HashSet
  - 🔗 Hash table + linked list

- **TreeSet**: 
  - 📊 Sorted order (natural or custom)
  - 🌳 O(log n) operations
  - 🔴 Red-black tree implementation

### 🚶 Queue/Deque Implementations
- **PriorityQueue**: 
  - 📈 Heap-based priority ordering
  - 🚫 Not thread-safe
  - ⚡ O(log n) insertion/removal

- **ArrayDeque**: 
  - 🚀 Faster than LinkedList for queue operations
  - 📦 Resizable circular array
  - 🚫 No capacity restrictions

### 🗺️ Map Implementations
- **HashMap**: 
  - ⚡ O(1) average access time
  - 🚫 Not synchronized
  - 🎲 No ordering guarantee

- **LinkedHashMap**: 
  - 📋 Maintains insertion/access order
  - 💾 HashMap + doubly-linked list
  - 🔄 Access-order mode for LRU cache

- **TreeMap**: 
  - 📊 Sorted by keys
  - 🌳 O(log n) operations
  - 🔴 Red-black tree

- **Hashtable**: 
  - 🔒 Synchronized (thread-safe)
  - 📜 Legacy class
  - 🚫 No null keys/values

## 🎯 Key Design Principles

1. **Interface Segregation**: Specific interfaces for different use cases
2. **Implementation Flexibility**: Multiple implementations per interface
3. **Type Safety**: Generics support since Java 5
4. **Iteration**: Consistent iteration patterns via Iterator
5. **Utility Support**: Rich utility methods in Collections/Arrays classes

## 🚀 Performance Characteristics

| Operation | ArrayList | LinkedList | HashSet | TreeSet | HashMap | TreeMap |
|-----------|-----------|------------|---------|---------|---------|---------|
| **Add** | O(1)* | O(1) | O(1) | O(log n) | O(1) | O(log n) |
| **Remove** | O(n) | O(1) | O(1) | O(log n) | O(1) | O(log n) |
| **Get** | O(1) | O(n) | O(1) | O(log n) | O(1) | O(log n) |
| **Contains** | O(n) | O(n) | O(1) | O(log n) | O(1) | O(log n) |

*O(n) when resizing is needed

## 🛡️ Thread Safety

| Class | Thread Safe | Alternative |
|-------|-------------|-------------|
| ArrayList | ❌ | Collections.synchronizedList() |
| LinkedList | ❌ | Collections.synchronizedList() |
| HashSet | ❌ | Collections.synchronizedSet() |
| HashMap | ❌ | ConcurrentHashMap |
| Vector | ✅ | ArrayList (preferred) |
| Hashtable | ✅ | ConcurrentHashMap (preferred) |

## 💡 Best Practices

1. **Program to interfaces**: Use List, Set, Map instead of concrete classes
2. **Choose right implementation**: Consider performance characteristics
3. **Use generics**: Ensure type safety
4. **Prefer modern alternatives**: ArrayDeque over Stack, HashMap over Hashtable
5. **Thread safety**: Use concurrent collections for multi-threaded environments