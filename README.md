# Loops Lab

## Part 1 NumberUtilities
* Ensure each of the test cases in the class ***NumberUtilitiesTest*** successfully passes upon completion of each of the method stubs in the class ***NumberUtilities***.
    * `String getEvenNumbers(int start, int stop)`
    * `String getOddNumbers(int start, int stop)`
    * `String getSquareNumbers(int start, int stop, int step)`
    * `String getRange(int start, int stop, int step)`
    * `String getExponentiations(int start, int stop, int step, int exponent)`

### `String getRange(int stop)`
* **Description**
    * Given an integer, `stop`, return a `String` concatenation of all integers between `0` up to and not including `stop`.
### Example
* Sample Script

    ```
    // : Given
    int stop = 11;
    
    // : When
    String outcome = NumberUtilities.getRange(stop);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    012345678910
    ```

### `String getRange(int start, int stop)`
* **Description**
    * Given two integers, `start`, and `stop`, return a `String` concatenation of all integers between `start` up to and not including `stop`.
### Example
* Sample Script

    ```
    // : Given
    int start = 5;
    int stop = 11;
    
    // : When
    String outcome = NumberUtilities.getRange(start, stop);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    5678910
    ```

### `String getRange(int start, int stop, int step)`
* **Description**
    * Given three integers, `start`, `stop`, and `step` return a `String` concatenation of all integers between `start`, incrementing by `step`, up to and not including `stop`.
### Example
* Sample Script

    ```
    // : Given
    int start = 5;
    int stop = 20;
    int step = 5;
    
    // : When
    String outcome = NumberUtilities.getRange(min, max, step);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    51015
    ```

### `String getEvenNumbers(int start, int stop)`
* **Description**
    * Given two integers, `start`, and `stop`, return a `String` concatenation of all even integers between `start` up to and not including `stop`.
### Example
* Sample Script

    ```
    // : Given
    int start = 5;
    int stop = 20;
    
    // : When
    String outcome = NumberUtilities.getOddNumbers(min, max);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    681012141618
    ```


### `String getOddNumbers(int start, int stop)`
* **Description**
    * Given two integers, `start`, and `stop`, return a `String` concatenation of all even integers between `start` up to and not including `stop`.
### Example
* Sample Script

    ```
    // : Given
    int start = 5;
    int stop = 20;
    
    // : When
    String outcome = NumberUtilities.getOddNumbers(min, max);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    5791113151719
    ```

### `String getSquareNumbers(int start, int stop)`
* **Description**
    * Given two integers, `start`, and `stop`, return a `String` concatenation of all values squared between `start` up to and not including `stop`.
### Example
* Sample Script

    ```
    // : Given
    int start = 5;
    int stop = 20;
    
    // : When
    String outcome = NumberUtilities.getOddNumbers(min, max);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    25100225
    ```

### `String getExponentiations(int start, int stop, int step, int exponent)`
* **Description**
    * Given four integers, `start`, `stop`, `step`, and `exponent`, return a `String` concatenation of all values, raised to the specified `exponent`, between `start` up to and not including `stop`, incrementing by the specified `step`.
### Example
* Sample Script

    ```
    // : Given
    int start = 5;
    int stop = 20;
    int step = 5;
    int exponent = 2;
    
    // : When
    String outcome = NumberUtilities.getOddNumbers(min, max);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    25100225
    ```

## Part 2 TriangleUtilities
* Ensure each of the test cases in the class ***TriangleUtilitiesTest*** successfully passes upon completion of each of the method stubs in the class ***TriangleUtilities***
    * `String getRow(int width)`
    * `String getSmallTriangle()`
    * `String getLargeTriangle()`
    * `String getTriangle(int n)`


<br><br><br><br>
### `String getRow(int width)`
* **Description**
    * In the class, `Triangles` Write a method that returns a `String` representation of a row of asterisks whose length is equal to the `width` specified.

### Example
* Sample Script

    ```
    // : Given
    int width = 10;
    
    // : When
    String outcome = Triangles.getRow(width);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    **********
    ```

### `String getSmallTriangle()`
* **Description**
    * In the class, `Triangles` Write a method that returns a `String` representation of a small triangle, whose base height and base width is 4 asterisks.

### Example
* Sample Script

    ```
    // : Given
    // : When
    String outcome = Triangles.getSmallTriangle();
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    *
    **
    ***
    ****
    
    ```


### `String getLargeTriangle()`
* **Description**
    * Write a method that returns a `String` representation of a large triangle, whose base height and base width is 10 asterisks.

### Example
* Sample Script

    ```
    // : Given
    // : When
    String outcome = Triangles.getLargeTriangle();
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    *
    **
    ***
    ****
    *****
    ******
    *******
    ********
    *********
    
    ```

### `String getTriangle(int n)`
* **Description**
    * Given one integer, `n`, generate a `String` representation of a triangle whose base height and width is equal to `n`.


### Example
* Sample Script

    ```
    // : Given
    int numberOfRows = 15;
    
    // : When
    String outcome = Triangles.createTriangle(numberOfRows);
    
    // : Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    *
    **
    ***
    ****
    *****
    ******
    *******
    ********
    *********
    **********
    ***********
    ************
    *************
    **************
    
    ```