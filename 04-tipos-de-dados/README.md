# Tipos de Dados: Comparativo entre Python, C e JavaScript

---

## 1. Quadro Comparativo

| Tipo de Dado   | Python          | C               | JavaScript      |
|----------------|-----------------|-----------------|-----------------|
| Inteiro        | `int`           | `int`           | `number`        |
| Ponto Flutuante| `float`         | `float`/`double`| `number`        |
| Caractere      | `str` (1 char)  | `char`          | `string`        |
| String         | `str`           | `char[]`        | `string`        |
| Booleano       | `bool`          | `_Bool`         | `boolean`       |
| Array/Lista    | `list`          | `array[]`       | `Array`         |
| Nulo           | `None`          | `NULL`          | `null`/`undefined` |

---

## 2. Exemplos Comentados por Linguagem

### **Python** (Tipagem Dinâmica)

     idade = 30  # Inteiro
     preco = 19.99  # Float
     nome = "Alice"   # String
     ativo = True  # Booleano
     numeros = [1, 2, 3]   # Lista (mutável)
     valor = None # None (equivalente a nulo)

### **C** 

     int a = 42;         // int
     float b = 3.14f;    // float
     char c[] = "C";     // string
     bool d = true;      // bool (C99+)
     int *e = NULL;      // ponteiro nulo
     printf("%d", a);    // 42


