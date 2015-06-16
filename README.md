# javacc-ext-cs
This is port of JavaCC version 6.0 with addition of support to generate .NET C# code. The code generator is highly customizable based on code templates. Unfortunatelly such templates are not sufficent to generate new language and source modifications are neccessary tu support C#.

In the test.tmp/CSSstyle.jj there is example of parsing CSS style files.

This project has some extensions from original project:

Added C# output in addition to C++ and Java outputs.
Added support for emitting both custom C# and Java code in the single grammar file. This is implemented as custom comment entries.
Added additional flag to emit parasoft suppress comments (to force ignore parasoft warnings)
Automatically exported from code.google.com/p/javacc-ext-cs
