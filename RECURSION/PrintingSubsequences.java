
import java.util.ArrayList;

class PrintingSubseuqences{
    public static void main(String[] args) {
        int[] arr={3,1,2};
        ArrayList<Integer> set=new ArrayList<>();
        subsequences(arr,0,set);     
    }
    static void subsequences(int[] arr,int i,ArrayList<Integer> set){
        if(i>=arr.length){
            System.out.println(set.toString());
            return;
        }

        set.add(arr[i]);
        subsequences(arr, i+1, set);
        set.remove(set.size() - 1);
        subsequences(arr, i+1, set);


    }

}
/*
Mistakes that I did:

### 1. Wrong base condition

Your base condition is:

```java
if(i==arr.length-1)
```

This stops before considering the last element.

It should be:

```java
if(i == arr.length){
    System.out.println(set);
    return;
}
```

---

### 2. Wrong way to remove from ArrayList

You wrote:

```java
set.remove(arr[i]);
```

`ArrayList` has two `remove()` methods:

```java
remove(int index)
remove(Object o)
```

Since `arr[i]` is an `int`, Java thinks you're calling

```java
remove(index)
```

For your array

```java
{3,1,2}
```

when `arr[i]` is `3`, Java tries

```java
set.remove(3);
```

which means **remove the element at index 3**, not the value `3`.

This causes an `IndexOutOfBoundsException`.

What you actually want is to remove the **last element you just added**:

```java
set.remove(set.size() - 1);
```

This is called **backtracking**.

---

## Correct Code

```java
import java.util.ArrayList;

class PrintingSubsequences {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        ArrayList<Integer> set = new ArrayList<>();
        subsequences(arr, 0, set);
    }

    static void subsequences(int[] arr, int i, ArrayList<Integer> set) {

        if (i == arr.length) {
            System.out.println(set);
            return;
        }

        // Take
        set.add(arr[i]);
        subsequences(arr, i + 1, set);

        // Don't Take
        set.remove(set.size() - 1);
        subsequences(arr, i + 1, set);
    }
}
```

---

### Output

```
[3, 1, 2]
[3, 1]
[3, 2]
[3]
[1, 2]
[1]
[2]
[]
```

---

## Why remove the last element?

Suppose:

```
set = []
```

Take `3`

```
set = [3]
```

Take `1`

```
set = [3,1]
```

Take `2`

```
set = [3,1,2]
```

Print.

Now you're returning to explore the branch where `2` is **not** taken.

So first undo the previous choice:

```
set.remove(set.size()-1)

set = [3,1]
```

Then recurse again.

Every recursive call **adds one element**, so every return must **remove that same last-added element**. This is the essence of **backtracking**.

---

### A small challenge for you

Without looking it up, can you explain why the base condition must be `i == arr.length` instead of `i == arr.length - 1`? Thinking through what happens to the last element will help you understand recursion more deeply.

 */




//NOTES ABOUT TIME AND SPACE COMPLEXITY

/*
You can add the following explanation to your GitHub notes.

---

## Time Complexity Analysis

At each index of the array, the algorithm makes **two recursive choices**:

1. Include the current element in the subsequence.
2. Exclude the current element from the subsequence.

Since every element has two possible choices, the recursion forms a **binary recursion tree**.

For an array of size **n**, the total number of subsequences generated is:

[
2^n
]

because each of the **n** elements can either be included or excluded independently.

Although the recursion itself visits **O(2ⁿ)** nodes, the algorithm prints every subsequence. A single subsequence can contain at most **n** elements, so printing one subsequence takes **O(n)** time in the worst case.

Therefore, the overall time complexity is:

[
\boxed{O(n \times 2^n)}
]

where:

* **2ⁿ** is the number of subsequences generated.
* **n** is the maximum time required to print a single subsequence.

---

## Space Complexity Analysis

The algorithm uses recursion and backtracking.

* The maximum depth of the recursion stack is equal to the number of elements in the array, i.e., **n**.
* The temporary `ArrayList` used to store the current subsequence can also hold at most **n** elements.

Hence, the auxiliary space complexity is:

[
\boxed{O(n)}
]

> **Note:** The space required to store or print all subsequences is not included in the auxiliary space complexity. If the output space is considered, it becomes **O(n × 2ⁿ)** since there are **2ⁿ** subsequences, each of length up to **n**.

---

## Summary

| Complexity                 | Value         |
| -------------------------- | ------------- |
| Time Complexity            | **O(n × 2ⁿ)** |
| Auxiliary Space Complexity | **O(n)**      |
| Output Space (if counted)  | **O(n × 2ⁿ)** |

### Key Intuition

* Every element has **2 choices**: **Take** or **Not Take**.
* Therefore, the recursion generates **2ⁿ** possible subsequences.
* Since each generated subsequence may contain up to **n** elements, printing all of them results in an overall time complexity of **O(n × 2ⁿ)**.
 */