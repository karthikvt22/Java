# Java Star Patterns

This repository contains Java programs for printing different star patterns.

## 📂 Patterns
- [4x5 Rectangle Pattern](https://static.takeuforward.org/wp/uploads/2022/08/P1.png)

### 📌 4x5 Rectangle Pattern Code
```java
public class Pattern4x5 {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

