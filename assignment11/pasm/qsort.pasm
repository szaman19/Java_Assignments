LOD FF
SUB #1
STO F0
LOD @F0
STO F0 
STO F2 
LOD FF
SUB #2
STO F1
LOD @F1
STO F1 
ADD #1
STO F3 
LOD F0
SUB F1
SUB #1
STO F4
CMPL F4
NOT
JMPZ #54 
LOD @F1 
STO F4 
LOD F2 
SUB F3
STO F5
CMPL F5
NOT
JMPZ #2F 
LOD F4
SUB @F3 
STO F5
CMPL F5
JMPZ #2B
LOD @F3 
STO F5
LOD @F2
STO @F3
LOD F5
STO @F2
LOD F2
SUB #1
STO F2 
JUMP #16
LOD F3 
ADD #1
STO F3
JUMP #16
LOD @F2 
STO @F1
LOD F4
STO @F2 
LOD #54
STO @FF
LOD FF
ADD #1
STO FF
LOD F1
STO @FF
LOD FF
ADD #1
STO FF
LOD F2
SUB #1
STO @FF
LOD FF
ADD #1
STO FF
LOD #53
STO @FF
LOD FF
ADD #1
STO FF
LOD F2
ADD #1
STO @FF
LOD FF
ADD #1
STO FF
LOD F0
STO @FF
LOD FF
ADD #1
STO FF 
JUMP #0 
LOD FF 
SUB #3
STO FF
LOD @FF
STO F0
JUMP &F0
HALT
