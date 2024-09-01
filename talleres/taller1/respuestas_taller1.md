### 1

| n                            | OUT[n] (x) |
|------------------------------|:---------:|
| x=0                          |     Z     |
| x = K // con K distinto de 0 |     NZ    |
---

### 2

| IN[n] (y) | OUT[n] (x)     |
|----------|---------------|
| ⊥        | bottom ⊥      |
| Z        | zero Z        |
| NZ       | non_zero NZ   |
| MZ       | maybe_zero MZ |
---

### 3

| IN[n] (y) | IN[n] (z) | OUT[n] (x)      |
|----------|----------|----------------|
| ⊥        | ⊥        | bottom ⊥       |
| Z        | ⊥        |  bottom ⊥      |
| NZ       | ⊥        | bottom ⊥       |
| MZ       | ⊥        | bottom ⊥       |
| ⊥        | Z        | bottom ⊥       |
| Z        | Z        | zero Z         |
| NZ       | Z        | non_zero NZ    |
| MZ       | Z        | Maybe_zero MZ  |
| ⊥        | NZ       | bottom ⊥       |
| Z        | NZ       | non_zero NZ    |
| NZ       | NZ       | maybe_zero MZ  |
| MZ       | NZ       | maybe_zero MZ  |
| ⊥        | MZ       | bottom ⊥       |
| Z        | MZ       | maybe_zero MZ  |
| NZ       | MZ       | maybe_zero MZ  |
| MZ       | MZ       | maybe_zero MZ  |

---
### 4

| IN[n] (y) | IN[n] (z) | OUT[n] (x)       |
|----------|----------|-----------------|
| ⊥        | ⊥        | [bottom ⊥]      |
| Z        | ⊥        | [bottom ⊥]      |
| NZ       | ⊥        | [bottom ⊥]      |
| MZ       | ⊥        | [bottom ⊥]      |
| ⊥        | Z        | [bottom ⊥]      |
| Z        | Z        | [zero Z]        |
| NZ       | Z        | [non_zero NZ]   |
| MZ       | Z        | [maybe_zero MZ] |
| ⊥        | NZ       | [bottom ⊥]      |
| Z        | NZ       | [non_zero NZ]   |
| NZ       | NZ       | [maybe_zero MZ] |
| MZ       | NZ       | [maybe_zero MZ] |
| ⊥        | MZ       | [bottom ⊥]      |
| Z        | MZ       | [maybe_zero MZ] |
| NZ       | MZ       | [maybe_zero MZ] |
| MZ       | MZ       | [maybe_zero MZ] |
---

### 5

| IN[n] (y) | IN[n] (z) | OUT[n] (x)       |
|----------|----------|-----------------|
| ⊥        | ⊥        | [bottom ⊥]      |
| Z        | ⊥        | [bottom ⊥]      |
| NZ       | ⊥        | [bottom ⊥]      |
| MZ       | ⊥        | [bottom ⊥]      |
| ⊥        | Z        | [bottom ⊥]      |
| Z        | Z        | [zero Z]        |
| NZ       | Z        | [zero Z]        |
| MZ       | Z        | [zero Z]        |
| ⊥        | NZ       | [bottom ⊥]      |
| Z        | NZ       | [zero Z]        |
| NZ       | NZ       | [non_zero NZ]   |
| MZ       | NZ       | [maybe_zero MZ] |
| ⊥        | MZ       | [bottom ⊥]      |
| Z        | MZ       | [zero Z]        |
| NZ       | MZ       | [maybe_zero MZ] |
| MZ       | MZ       | [maybe_zero MZ] |   
---

### 6

| IN[n] (y) | IN[n] (z) | OUT[n] (x)       |
|----------|----------|-----------------|
| ⊥        | ⊥        | [bottom ⊥]      |
| Z        | ⊥        | [bottom ⊥]      |
| NZ       | ⊥        | [bottom ⊥]      |
| MZ       | ⊥        | [bottom ⊥]      |
| ⊥        | Z        | [bottom ⊥]      |
| Z        | Z        | [bottom ⊥]      |
| NZ       | Z        | [bottom ⊥]      |
| MZ       | Z        | [bottom ⊥]      |
| ⊥        | NZ       | [bottom ⊥]      |
| Z        | NZ       | [zero Z]        |
| NZ       | NZ       | [maybe_zero MZ] |
| MZ       | NZ       | [maybe_zero MZ] |
| ⊥        | MZ       | [bottom ⊥]      |
| Z        | MZ       | [zero Z]        |
| NZ       | MZ       | [maybe_zero MZ] |
| MZ       | MZ       | [maybe_zero MZ] |
---

### 7
| IN[n] (x)        | IN[n] (y)        | OUT[n] (x)       | OUT[n] (y)       |
|-----------------|-----------------|-----------------|-----------------|
| ⊥ bottom        | MZ              | [bottom ⊥]      | [maybe_zero MZ] |
| [bottom ⊥]      | [maybe_zero MZ] | [maybe_zero MZ] | [maybe_zero MZ] |
| [maybe_zero MZ] | [maybe_zero MZ] | [maybe_zero MZ] | [non_zero NZ]   |
| [maybe_zero MZ] | [maybe_zero MZ] | [maybe_zero MZ] | [maybe_zero MZ] |
| [maybe_zero MZ] | [maybe_zero MZ] | [maybe_zero MZ] | [maybe_zero MZ] |
| [maybe_zero MZ] | [maybe_zero MZ] | [maybe_zero MZ] | [maybe_zero MZ] |
| [maybe_zero MZ] | [maybe_zero MZ] | [maybe_zero MZ] | [maybe_zero MZ] |

