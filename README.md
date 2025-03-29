# Testing-Nivell2

## Description

This project contains various Java classes and associated tests that utilize AssertJ to verify different assertions about objects, arrays, and collections.

## Exercises

### Exercise 1
- **Objective**: Demonstrate that the value of two integer objects is equal and that it is not.
- **Assertions**:
  ```java
  assertThat(object1).isEqualTo(object2);
  assertThat(object1).isNotEqualTo(object2);

### Exercise 2
- **Objective**: Verify that the reference to one object is the same as another and that it is different.
- **Assertions**:
  ```java
  assertThat(objectA).isSameAs(objectB);
  assertThat(objectA).isNotSameAs(objectC);

### Exercise 3
- **Objective**:  Indicate that two integer arrays are identical.
- **Assertions**:
  ```java
  assertThat(array1).isEqualTo(array2);

### Exercise 4
- **Objective**: Create an ArrayList containing various types of objects and verify the order.
- **Assertions**:
  ```java
  Verify order:
  assertThat(arrayList).containsExactly(expectedOrder);

  Verify that the list contains the objects in any order:
  assertThat(arrayList).containsOnlyElementsOf(expectedObjects);

  Verify that an object is added only once:
  assertThat(arrayList).containsOnlyOnce(object);

  Verify that the list does not contain a missing element:
  assertThat(arrayList).doesNotContain(missingObject);


### Exercise 5
- **Objective**: Create a map and verify that it contains one of the added keys.
- **Assertions**:
  ```java
  assertThat(map).containsKey(key);

### Exercise 6
- **Objective**: Trigger an ArrayIndexOutOfBoundsException and validate that the exception is thrown.
- **Assertions**:
  ```java
  assertThatThrownBy(() -> {
    // Code that triggers the exception
}).isInstanceOf(ArrayIndexOutOfBoundsException.class);

### Exercise 7
- **Objective**: Create an empty Optional object and verify that it is indeed empty.
- **Assertions**:
  ```java
  assertThat(optional).isEmpty();


## Requirements
Java 8 or higher

AssertJ dependency

## Installation
Clone this repository: https://github.com/ToniR90/1.4-Testing-Nivell2.git

Import the project into your Java development environment.

Ensure that you have the necessary dependencies for AssertJ.