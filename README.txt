SOEN 6441: Advanced Programming Practices (Section U) - Assignment 3

STUDENT NUMBER:
40233170: ARYAN SAXENA
40197012: ANANYA VARSHA
________________________________________________________________
________________________________________________________________

'Instrumentator.aj' monitors the project and cuts at the points where required.


1. My first point cut is run before the main function is executed, It runs the code blow and creates a 'dot' file named call-graph.dot (if it does not exist). 

2. When the main function is run, a new instance of the Blogger class is created.  

3.  The Pointcut named Pointcut2 will be run after returning from the call to addObserver for Newsportal, Newspaper and MobileSubscriber. And add the details to the dot file.

4. Pointcut1 will be run before the call to the notify observer and update Observer Methods of the Blogger class. And the details will be added to the dot file.

5. Pointcut2 then will then get call again with the function getHeadline, and the details will get added to the dot file.\

6. This function will run until all the point cuts code blocks have been executed for the main function.

7. After returning from the main function, the closing parenthesis will be added to the dot file.

8. Post the pointcuts from Instrumentator.aj, a 'call-graph.dot' file is generated with the deemed output. 
________________________________________________________________

Visualization was done using Graphviz Visualization Software. 


1. In order to create a graph using Graphviz, the file that was created using the Intrumentator is taken as input and a PNG Image file is saved as output.

2. In order to create the PNG file. On the terminal, we used the function:

dot -Tpng call-graph.dot -o output.png

3. The PNG file with the required Graph is generated.

________________________________________________________________
