LOD [FF
SUB 1
STO [F0
LOD [[F0
SUB 2
STO [F1
CMPL [F1
JMPZ E
LOD [FF
SUB 3
STO [F0
LOD [[F0
STO [F0
JUMP [F0
LOD [FF
SUB 2
STO [F1
LOD 22
STO [[FF
LOD [FF
ADD 1
STO [FF
LOD [[F1
STO [[FF
LOD [FF
ADD 1
STO [FF
LOD [[F0
DIV 2
STO [[FF
LOD [FF
ADD 1
STO [FF
JUMP 0
LOD [FF
SUB 1
STO [F0
SUB 3
STO [F1
SUB 1
STO [F2
ADD 2
STO [FF
LOD 3D
STO [[FF
LOD [FF
ADD 1
STO [FF
LOD [[F0
ADD [[F2
STO [[FF
LOD [FF
ADD 1
STO [FF
LOD [[F1
SUB [[F0
STO [[FF
LOD [FF
ADD 1
STO [FF
JUMP 0
LOD [FF
SUB 1
STO [FF
LOD [[FF
STO [FC
LOD [FF
SUB 1
STO [FF
LOD [[FF
STO [FA
STO [FB
ADD [FC
STO [FC
LOD [FF
SUB 1
STO [FF
STO [FD
SUB 1
STO [F0
LOD [[F0
STO [FE
LOD [F0
SUB 1
STO [F0
LOD [[F0
STO [F8
STO [F9
LOD [F9
SUB [FA
JMPZ 72
LOD [FB
SUB [FC
JMPZ 7E
LOD [[F9
SUB [[FB
STO [F0
CMPL [F0
JMPZ 69
LOD [[F9
STO [[FD
LOD [F9
ADD 1
STO [F9
JUMP 6E
LOD [[FB
STO [[FD
LOD [FB
ADD 1
STO [FB
LOD [FD
ADD 1
STO [FD
JUMP 58
LOD [FB
SUB [FC
JMPZ 8A
LOD [[FB
STO [[FD
LOD [FB
ADD 1
STO [FB
LOD [FD
ADD 1
STO [FD
JUMP 72
LOD [F9
SUB [FA
JMPZ 8A
LOD [[F9
STO [[FD
LOD [F9
ADD 1
STO [F9
LOD [FD
ADD 1
STO [FD
JUMP 7E
LOD [FF
STO [FD
LOD [FE
JMPZ 9A
LOD [[FD
STO [[F8
LOD [FD
ADD 1
STO [FD
LOD [F8
ADD 1
STO [F8
LOD [FE
SUB 1
STO [FE
JUMP 8C
LOD [FF
SUB 3
STO [F0
LOD [[F0
STO [F0
JUMP [F0
NOP
HALT
DATA
0 A1
1 A0
2 40
FF 3
A0 47
A1 54
A2 39
A3 42
A4 5
A5 45
A6 63
A7 40
A8 20
A9 48
AA 60
AB 17
AC 52
AD 32
AE 12
AF 27
B0 51
B1 49
B2 50
B3 36
B4 6
B5 7
B6 28
B7 15
B8 19
B9 64
BA 30
BB 21
BC 56
BD 4
BE 43
BF 24
C0 44
C1 13
C2 59
C3 58
C4 8
C5 23
C6 14
C7 34
C8 3
C9 53
CA 18
CB 62
CC 33
CD 37
CE 61
CF 10
D0 2
D1 29
D2 46
D3 57
D4 38
D5 41
D6 1
D7 26
D8 16
D9 35
DA 11
DB 55
DC 22
DD 9
DE 25
DF 31
