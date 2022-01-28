

**Little Innovators**



"Little Innovators" Slogan Writing Competition was organized for the students at Johns Senior School. The important guideline for the contest was that the Slogan(Case insensitive) should contain a string where the sum of occurrences of the same character in it is equal to the sum of the numbers of occurrences of unique characters in the string. Create a Java application to help the event organizers to determine whether the submitted Slogans adhere to the given condition. 

Note: 

Slogan must contain alphabets and white space otherwise, print "Invalid slogan" and terminate the program 

Output a single line containing "All the guidelines are satisfied for <slogan>" if the string satisfies the guideline given above or "<slogan> does not satisfy the guideline" otherwise. 

Ignore the spaces between words 

 

Please do not use System.exit(0) to terminate the program 

 

Sample Input 1: 

Wifi Pizza Sleep 

Sample Output 1: 

All the guidelines are satisfied for Wifi Pizza Sleep 

Explanation: 

In the above Slogan, sum of occurrence of the same characters is 7(i,i,i,z,z,e,e) and the sum of occurrence of unique character is 7(W,f,P,a,S,l,p). Since both are equal, print "All the guidelines are satisfied for Wifi Pizza Sleep" 

 

Sample Input 2: 

Think different 

Sample Output 2: 

Think different does not satisfy the guideline 

Explanation: 

In the above Slogan, the sum of the occurrence of the same character is 10 and the sum of occurrence of unique character is 4 and 10 is not equal to 4. So print "Think different does not satisfy the guideline" 

 

Sample Input 3: 

Friend in @Need 

Sample Output 3: 

Invalid slogan 
