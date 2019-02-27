# javacc-ext-cs
This is port of JavaCC version 6.0 with addition of support to generate .NET C# code. The code generator is highly customizable based on code templates. 
Unfortunatelly such templates are not sufficent to generate new language and source modifications are neccessary tu support C#.

In the test.tmp/cssStyle.jj there is example of parsing CSS style files.

This project has some extensions from original project:

1. Added C# output in addition to C++ and Java outputs.
2. Added support for emitting both custom C# and Java code in the single grammar file. This is implemented as custom comment entries is the style /**java */ and /**cs  */. It allows to emit custom code to both language output from the same grammar file. 
3. Added additional flag to emit parasoft suppress comments (to force ignore parasoft warnings)
 
Javacc homepage and tutorials is at https://github.com/javacc/javacc but the code is based on version 6.0 when code was based from original source code from https://javacc.java.net/ 

The best documentation with tips and tricks for javacc are from https://www.engr.mun.ca/~theo/JavaCC-FAQ/javacc-screen-faq.pdf

