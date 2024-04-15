class Solution {
    public double average(int[] salary) {
        int minimumSalary = salary[0];
    int maximumSalary = salary[0];
    
    int sum = 0;
    
    for (int s : salary) {
      
      sum += s;
      
      if (s > maximumSalary) {
        maximumSalary = s;
      } else if (s < minimumSalary) {
        minimumSalary = s;
      }
      
    }
    
    sum -= minimumSalary;
    sum -= maximumSalary;
    
    return (double)sum / (double)(salary.length - 2);

  }
    }
