# Problem Scenario

Imagine you're developing an e-commerce application where customers create accounts with varying levels of detail.

Initially, you use a standard constructor for the User class:

<b>public User(String firstName, String lastName, String email,
            String address, String phone, int age) {
      // ...
}</b>

However, you encounter challenges:

<ul>
	<li><b>Registration forms: It's cumbersome to ensure users enter all fields in the correct order, leading to errors and frustration.</b></li>
	<li><b>Optional fields: Not all customers provide complete information, but the constructor forces them to.</b></li>
	<li><b>Data consistency: Changes to user profiles after registration can cause unexpected issues due to mutable fields.</b></li>
</ul>

Implement solution using the Builder Pattern to address the issue.

# UML Diagram
![Blank diagram - Page 1 (8)](https://github.com/zakidasalla/SoftwareEngineering2_CourseProjects/assets/142433516/98c0b06a-917b-4417-9793-0770e64b314d)
