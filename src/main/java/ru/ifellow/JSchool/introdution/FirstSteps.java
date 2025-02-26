package ru.ifellow.JSchool.introdution;

public class FirstSteps {

    public int sum(int x, int y) {
        if (Integer.MAX_VALUE - x < y || Integer.MIN_VALUE - x < y) {
            throw new IllegalArgumentException();
        }
        return x + y;
    }

    public int mul(int x, int y) {
        if (Integer.MAX_VALUE / Math.abs(x) < Math.abs(y)) {
            throw new IllegalArgumentException();
        }
        return x * y;
    }

    public int div(int x, int y) {
        return x / y;
    }

    public int mod(int x, int y) {
        return x % y;
    }

    public boolean isEqual(int x, int y) {
        return x == y;
    }

    public boolean isGreater(int x, int y) {
        return x > y;
    }

    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y) {
        return x >= xLeft && x <= xRight && y >= yTop && y <= yBottom;
    }

    public int sum(int[] array) {
        if (array == null) {
            return 0;
        }
        int sum = 0;
        for (int num : array) {
            if ((num > 0 && sum > Integer.MAX_VALUE - num) ||
                    (num < 0 && sum < Integer.MIN_VALUE - num)) {
                throw new IllegalArgumentException();
            }
            sum += num;
        }
        return sum;
    }

    public int mul(int[] array) {
        if (array == null || array.length == 0) return 0;
        int result = 1;
        for (int num : array) {
            if (num != 0 && ((result > Integer.MAX_VALUE / num) || (result < Integer.MIN_VALUE / num))) {
                throw new IllegalArgumentException();
            }
            result *= num;
        }
        return result;
    }

    public int min(int[] array) {
        if (array == null || array.length == 0) return Integer.MAX_VALUE;
        int min = array[0];
        for (int num : array) {
            if (num < min) min = num;
        }
        return min;
    }

    public int max(int[] array) {
        if (array == null || array.length == 0) return Integer.MIN_VALUE;
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public double average(int[] array) {
        if (array == null || array.length == 0) return 0;
        return (double) sum(array) / array.length;
    }

    public boolean isSortedDescendant(int[] array) {
        if (array == null || array.length == 0) return true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public void cube(int[] array) {
        for (int i = 0; i < array.length; i++) {
            long cube = (long) array[i] * array[i] * array[i];
            if (cube > Integer.MAX_VALUE || cube < Integer.MIN_VALUE) {
                throw new IllegalArgumentException();
            }
            array[i] = (int) cube;
        }
    }

    public boolean find(int[] array, int value) {
        if (array == null) {
            return false;
        }
        for (int num : array) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }

    public void reverse(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        int left = 0, right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    public boolean isPalindrome(int[] array) {
        if (array == null || array.length == 0) {
            return true;
        }
        int left = 0, right = array.length - 1;
        while (left < right) {
            if (array[left] != array[right]) return false;
            left++;
            right--;
        }
        return true;
    }

    public int sum(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int[] row : matrix) {
            for (int num : row) {
                if ((num > 0 && sum > Integer.MAX_VALUE - num) ||
                        (num < 0 && sum < Integer.MIN_VALUE - num)) {
                    throw new IllegalArgumentException();
                }
                sum += num;
            }
        }
        return sum;
    }

    public int max(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = Integer.MIN_VALUE;
        for (int[] row : matrix) {
            for (int num : row) {
                if (num > max) {
                    max = num;
                }
            }
        }
        return max;
    }

    public int diagonalMax(int[][] matrix) {
            if (matrix == null || matrix.length == 0 || matrix[0] == null) {
                return Integer.MIN_VALUE;
            }
            for (int[] row : matrix) {
                if (row == null || row.length != matrix.length) {
                    throw new IllegalArgumentException();
                }
            }

            int max = Integer.MIN_VALUE;
            for (int i = 0; i < matrix.length; i++) {
                max = Math.max(max, matrix[i][i]);
            }
            return max;
        }

    public boolean isSortedDescendant(int[][] matrix) {
        if (matrix == null) {
            return true;
        }
        for (int[] row : matrix) {
            if (row == null || row.length < 2) {
                continue;
            }
            if (!isSortedDescendant(row)) {
                return false;
            }
        }
        return true;
    }
}