**Assumptions**
* In case of rectangle x1, y1 always refer to top left and x2 , y2 to bottom right
* In case of line x1,y1 is left or top end and x2,y2 to be right or bottom end
* User can create zero size rectangle which will seem like line
* Bucket fill will not start if given point lie on any shape
* Line and rectangle will be drawn from left top to bottom right
* Later shape will replace previous shape if they overlap
* Negative coordinates will be converted into positive ones
* If more than required arguments is given first required arguments will be picked\
\
**To Run just run the Driver class**\
You need java 8 to run this project
* Already compiled class are also there you can just use command\
*Run Command all from the root directory of project*\
   only if you don't alread have mvn
   * `sudo apt-get install maven`
   
   * `mvn clean install` 
   
   * `mvn compile` 
   
   * `mvn exec:java -Dexec.mainClass="com.console.drawingboard.Driver"`

**Commands**\
To make canvas
`C H W`

To make rectangle
`R x1 y1 x2 y2`

To make a Line 
`L x1 y1 x2 y2`

To quit application
`Q`
