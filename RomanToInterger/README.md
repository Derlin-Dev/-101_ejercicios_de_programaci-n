# 🧠 101 Ejercicios de Programación

## 📌 Fuente
**LeetCode**  
🔗 https://leetcode.com/problems/roman-to-integer/

---

## 🧮 Roman to Integer (De Romano a Entero)

Los números romanos están representados por siete símbolos diferentes:

| Símbolo | Valor |
|---------|-------|
| I       | 1     |
| V       | 5     |
| X       | 10    |
| L       | 50    |
| C       | 100   |
| D       | 500   |
| M       | 1000  |

### 📖 Descripción

Por ejemplo:
- **2** se escribe como `II`
- **12** se escribe como `XII` (X + II)
- **27** se escribe como `XXVII` (XX + V + II)

Los números romanos suelen escribirse de **mayor a menor**, de izquierda a derecha.  
Sin embargo, existen casos especiales donde se aplica la **resta** en lugar de la suma.

### 🔻 Casos de resta permitidos

- `I` antes de `V` (5) o `X` (10) → **4 y 9**
- `X` antes de `L` (50) o `C` (100) → **40 y 90**
- `C` antes de `D` (500) o `M` (1000) → **400 y 900**

🎯 **Objetivo:**  
Dado un número romano, conviértelo en un número entero.

---

## 🧪 Ejemplos

### Ejemplo 1
**Entrada: s = "III"***
Explicación: III=3.

### Ejemplo 2
***Entrada: s = "LVIII"***
Salida: 58
Explicación: L = 50, V = 5, III = 3.

### Ejemplo 3:

***Entrada: s = "MCMXCIV"***
Salida: 1994
Explicación: M = 1000, CM = 900, XC = 90 y IV = 4.

