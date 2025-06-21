# Sierpinski's Triangle

<hr>

[백준 2448번: 별 찍기 - 11](https://www.acmicpc.net/problem/2448)<br><br>
첫째 줄에 `N`이 주어진다. `N`은 항상 3×(2<sup>`k`</sup>) 수이다. (3, 6, 12, 24, 48, ...) (0 ≤ `k` ≤ 10, `k`는 정수)
첫째 줄부터 `N`번째 줄까지 별을 출력한다.
<hr>

Input
```python
n = 3
```
Output
```python
  *   
 * *  
*****
```
<br>

Input
```python
n = 6
```
Output
```python
     *      
    * *     
   *****    
  *     *   
 * *   * *  
***** *****
```
<br>

Input
```python
n = 12
```
Output
```python
           *            
          * *           
         *****          
        *     *         
       * *   * *        
      ***** *****       
     *           *      
    * *         * *     
   *****       *****    
  *     *     *     *   
 * *   * *   * *   * *  
***** ***** ***** *****
```

<hr>
<br>
출력 형식이 잘못되었다고 뜨는 경우 삼각형 뒤에 공백을 잘 봐야한다.