LOD  @0
STO @1
LOD @0
SUB #1
STO @0
STO  5

CMPZ 5
SUB #1
JMPZ 3
LOD  &0
MUL  &1
JUMP 2
HALT
