class InOutTester {
	
	public static void main(String [] args) {
		// demo program for functionality of In.java and Out.java
		
		Out.print("\nDemo of Classes In and Out\n");
		
		// byte
		Out.print("\n\nbyte: ");
		byte bb = In.readByte();
		Out.println(bb);
		Out.print(bb);

		
		// boolean
		Out.print("\n\nboolean: ");
		boolean b = In.readBoolean();
		Out.println(b);
		Out.print(b);
		
		
		// short
		Out.print("\n\nshort: ");
		short s = In.readShort();
		Out.println(s);
		Out.print(s);

		
		// char
		Out.print("\n\nchar: ");
		char c = In.readChar();
		Out.println(c);
		Out.print(c);

		
		// int
		Out.print("\n\nint: ");
		int i = In.readInt();
		Out.println(i);
		Out.print(i);

		
		// long
		Out.print("\n\nlong: ");
		long l = In.readLong();
		Out.println(l);
		Out.print(l);

		
		// float
		Out.print("\n\nfloat: ");
		float f = In.readFloat();
		Out.println(f);
		Out.print(f);

		
		// double
		Out.print("\n\ndouble: ");
		double d = In.readDouble();
		Out.println(d);
		Out.print(d);

		
		// String
		Out.print("\n\nString: ");
		String str = In.readString();
		Out.println(str);
		Out.print(str);
	
	
		// Char[]
		Out.print("\n\nchar []\n");
		char [] a = {'a','b','c'};
		Out.println(a);
		Out.print(a);

		
		// Object
		Out.print("\n\nObject");
		Object o = new Object();
		Out.println(o);
		Out.print(o);
		
		Out.print("\n\nread(): ");
		char aCharacter = In.read();
		while(aCharacter != In.LF_CHAR) {
			Out.println(aCharacter);
			aCharacter = In.read();
		} 
		
		Out.print("\n\nEnd ---");
	
		
	}
}

// program gives the following output....
/*
Demo of Classes In and Out


byte: 1
1
11
1

boolean: true
true
truetrue
true

short: 1
1
11
1

char: X
X
XX
X

int: 123
123
123123
123

long: 1234567890123
1234567890123
12345678901231234567890123
1234567890123

float: 1.0
1.0
1.01.0
1.0

double: 1234567890.1234567890
1.2345678901234567E9
1.2345678901234567E91.2345678901234567E9
1.2345678901234567E9

String: This is a text!
This is a text!
This is a text!This is a text!
This is a text!

char []
abc
abcabc
abc

Objectjava.lang.Object@15db9742
java.lang.Object@15db9742java.lang.Object@15db9742
java.lang.Object@15db9742

read(): abcdefghijklmnopqrstuvwxyz
a
b
c
d
e
f
g
h
i
j
k
l
m
n
o
p
q
r
s
t
u
v
w
x
y
z


End ---
*/