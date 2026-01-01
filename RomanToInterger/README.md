# -101_ejercicios_de_programaci-n

## Fuente : LeetCode -> https://leetcode.com/problems/two-sum/description/

## 🧮 Two Sum (Suma de dos números)

Dada una matriz de números enteros `nums` y un número entero `target`, devuelve los **índices de los dos números** tales que su suma sea igual a `target`.

Puedes asumir que **siempre habrá exactamente una solución**, y **no puedes usar el mismo elemento dos veces**.

La respuesta puede devolverse en cualquier orden.

---

## 📌 Ejemplos

### ✔️ Ejemplo 1
**Entrada:**  
`nums = [2,7,11,15]`, `target = 9`  
**Salida:**  
`[0,1]`  
**Explicación:**  
Como `nums[0] + nums[1] == 9`, devolvemos `[0, 1]`.

---

### ✔️ Ejemplo 2
**Entrada:**  
`nums = [3,2,4]`, `target = 6`  
**Salida:**  
`[1,2]`

---

### ✔️ Ejemplo 3
**Entrada:**  
`nums = [3,3]`, `target = 6`  
**Salida:**  
`[0,1]`

---

## 🔒 Restricciones

- `2 <= nums.length <= 10^4`
- `-10^9 <= nums[i] <= 10^9`
- `-10^9 <= target <= 10^9`
- Solo existe **una única solución válida**.
