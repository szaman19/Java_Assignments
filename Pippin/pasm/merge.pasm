LOD FF
SUB #1
STO F0
LOD @F0
SUB #2
STO F1
CMPL F1
JMPZ #E
LOD FF
SUB #3
STO F0
LOD @F0
STO F0
JUMP &F0
LOD FF
SUB #2
STO F1
LOD #22
STO @FF
LOD FF
ADD #1
STO FF
LOD @F1
STO @FF
LOD FF
ADD #1
STO FF
LOD @F0
DIV #2
STO @FF
LOD FF
ADD #1
STO FF
JUMP #0
LOD FF
SUB #1
STO F0
SUB #3
STO F1
SUB #1
STO F2
ADD #2
STO FF
LOD #3D
STO @FF
LOD FF
ADD #1
STO FF
LOD @F0
ADD @F2
STO @FF
LOD FF
ADD #1
STO FF
LOD @F1
SUB @F0
STO @FF
LOD FF
ADD #1
STO FF
JUMP #0
LOD FF
SUB #1
STO FF
LOD @FF
STO FC
LOD FF
SUB #1
STO FF
LOD @FF
STO FA
STO FB
ADD FC
STO FC
LOD FF
SUB #1
STO FF
STO FD
SUB #1
STO F0
LOD @F0
STO FE
LOD F0
SUB #1
STO F0
LOD @F0
STO F8
STO F9
LOD F9
SUB FA
JMPZ #72
LOD FB
SUB FC
JMPZ #7E
LOD @F9
SUB @FB
STO F0
CMPL F0
JMPZ #69
LOD @F9
STO @FD
LOD F9
ADD #1
STO F9
JUMP #6E
LOD @FB
STO @FD
LOD FB
ADD #1
STO FB
LOD FD
ADD #1
STO FD
JUMP #58
LOD FB
SUB FC
JMPZ #8A
LOD @FB
STO @FD
LOD FB
ADD #1
STO FB
LOD FD
ADD #1
STO FD
JUMP #72
LOD F9
SUB FA
JMPZ #8A
LOD @F9
STO @FD
LOD F9
ADD #1
STO F9
LOD FD
ADD #1
STO FD
JUMP #7E
LOD FF
STO FD
LOD FE
JMPZ #9A
LOD @FD
STO @F8
LOD FD
ADD #1
STO FD
LOD F8
ADD #1
STO F8
LOD FE
SUB #1
STO FE
JUMP #8C
LOD FF
SUB #3
STO F0
LOD @F0
STO F0
JUMP &F0
NOP
HALT