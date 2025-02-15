# Report for Payroll Generator

This report helps you demonstrate your understanding of the concepts. You should write this report after you have completed the project. 

## Technical Questions

1. What does CSV stand for? 
   
It stands for Comma Seperated Values. [^1]

2. Why would you declare `List<IEmployee>` instead of `ArrayList<HourlyEmployee>`?
    
IEmployee can include any type of subclass below it and there are multiple types of employees within the program.  In the module 4, lesson 15, it is said that arrays cannot associate operations directly as it does with lists.

3. When you have one class referencing another object, such as storing that object as one of the attributes of the first class - what type of relationship is that called (between has-a and is-a)?

This is a has-a relationship.

4. Can you provide an example of a has-a relationship in your code (if one exists)?

In PayrollGenerator, it uses IPaystub in its main function.

5. Can you provide an example of an is-a relationship in your code (if one exists)?

The SalaryEmployee and HourlyEmployee enxtend employee.

6. What is the difference between an interface and an abstract class?

Both provide an outline for classes but abstract classes can include some implementation of methods and variables, while interfaces cannot. [^2]

7. What is the advantage of using an interface over an abstract class?

An interface is more reusable than an abstract class. [^2]

8. Is the following code valid or not? `List<int> numbers = new ArrayList<int>();`, explain why or why not. If not, explain how you can fix it. 

It is valid. In module 4, lesson 15, it says that the ArrayList type is a List.

9. Which class/method is described as the "driver" for your application? 

The PayrollGenerator class is the driver. It has the main method and implements the classes to create the payroll.

10. How do you create a temporary folder for JUnit Testing?

In TestPayrollGenerator, there is an example of creating a temporary folder. It uses Path to create a temporary folder that copies the employees and paystub files.


## Deeper Thinking 

Salary Inequality is a major issue in the United States. Even in STEM fields, women are often paid less for [entry level positions](https://www.gsb.stanford.edu/insights/whats-behind-pay-gap-stem-jobs). However, not paying equal salary can hurt representation in the field, and looking from a business perspective, can hurt the company's bottom line has diversity improves innovation and innovation drives profits. 

Having heard these facts, your employer would like data about their salaries to ensure that they are paying their employees fairly. While this is often done 'after pay' by employee surveys and feedback, they have the idea that maybe the payroll system can help them ensure that they are paying their employees fairly. They have given you free reign to explore this idea.

Think through the issue / making sure to cite any resources you use to help you better understand the topic. Then write a paragraph on what changes you would need to make to the system. For example, would there be any additional data points you would need to store in the employee file? Why? Consider what point in the payroll process you may want to look at the data, as different people could have different pretax benefits and highlight that. 

The answer to this is mostly open. We ask that you cite at least two sources to show your understanding of the issue. The TAs will also give feedback on your answer, though will be liberal in grading as long as you show a good faith effort to understand the issue and making an effort to think about how your design to could help meet your employer's goals of salary equity. 


In America, the wage gap in STEM is only getting larger.[^3] This also coinsides with the representation of women in STEM, with women only making up 21% of engineering majors and 19% of computer and information science majors. [^4] This analysis is helpful to know the issue, but more helpful information for companies is a reflection of their wages while payroll is being generated.
A way to potentially apply this to this program is to have it create a file that compares employees of similar job levels and their pay. This would mean that Employee would have to have an attribute of some type to store their job level. A CSV could be generated organized by job levels to easily visualize pay between employees of the same level. If needed, Employee could also have gender stored and be provided in this CSV.
## References

[^1]: Comma-Separated Values: 2025. https://en.wikipedia.org/wiki/Comma-separated_values. Accessed: 2025-02-14. 
[^2]: Difference between Abstract Class and Interface in Java: 2025. https://www.geeksforgeeks.org/difference-between-abstract-class-and-interface-in-java/. Accessed: 2025-02-14.
[^3]: Why is the gender pay gap widening in STEM?: 2024. https://www.hrdive.com/news/gender-pay-gap-widening-in-stem/717223/. Accessed: 2025-02-14.
[^4]: The STEM Gap: Women and Girls in Science, Technology, Engineering and Mathematics. https://www.aauw.org/resources/research/the-stem-gap/. Accessed: 2025-02-14.