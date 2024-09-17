# Problema: Contagem de Nucleotídeos

## Descrição:

Dada uma sequência de DNA representada como uma string, seu objetivo é contar quantas vezes cada um dos quatro nucleotídeos (A, C, G, T) aparece na sequência. As letras na sequência de DNA representam os nucleotídeos: 
- `A` (Adenina),
- `C` (Citosina),
- `G` (Guanina),
- `T` (Timina).

Você deverá implementar uma função que recebe uma string representando a sequência de DNA e retorna a quantidade de cada nucleotídeo presente na sequência.

## Requisitos:

- A função deve receber como entrada uma string contendo apenas os caracteres 'A', 'C', 'G', e 'T'.
- A função deve retornar a contagem de cada nucleotídeo em um formato que especifique a quantidade de cada um.
- A solução deve ser eficiente e lidar com sequências de tamanhos variados, incluindo a sequência vazia.

## Entrada
- Uma string contendo apenas os caracteres 'A', 'C', 'G', e 'T'.
- A String de entrada representa uma **Sequência de Nucleotídeos**.
- Nossa entrada pode ter 16 caracteres no máximo.

## Exemplo de Entrada e Saída:

### Exemplo 1:
- Entrada:
  ```plaintext
  "ACGTACGT"
  ```
- Saída:
  ```plaintext
  A: 2  
  C: 2  
  G: 2  
  T: 2
  ```

### Exemplo 2:
- Entrada:
  ```plaintext
  "AAAA"
  ```
- Saída:
  ```plaintext
  A: 4  
  C: 0  
  G: 0  
  T: 0
  ```

### Exemplo 3 (sequência vazia):
- Entrada:
  ```plaintext
  ""
  ```
- Saída:
  ```plaintext
  A: 0  
  C: 0  
  G: 0  
  T: 0
  ```

## Casos Especiais:

1. **Sequência Vazia:**
    - Entrada: `""`
    - Saída: `A: 0, C: 0, G: 0, T: 0`
   
2. **Sequência com um único nucleotídeo repetido:**
    - Entrada: `"AAAA"`
    - Saída: `A: 4, C: 0, G: 0, T: 0`

3. **Sequência com nucleotídeos misturados:**
    - Entrada: `"ACGTTGCA"`
    - Saída: `A: 2, C: 2, G: 2, T: 2`

4. **Sequência com caracteres inválidos:**
    - Entrada: `"ABCDERGZ$aTg"`
    - Saída:
    ```plain
    IllegalArgumentException: 
        [PROBLEMA] SEQUENCIA DE CARACTERES INVÁLIDOS! 
    
        [INPUT] SEQUENCIA FORNECIDA: ACTGGTACCCAATGATAAAA
        [CALC]  CARACTERES INVÁLIDOS: [B, D, E, R, Z, $, a, g]
        [CALC]  POS CARACTERES INVALIDOS: [1, 3, 4, 5, 7, 8, 9, 11] 
        [CONF]  CARACTERES DE INTERESSE CONFIGURADOS: [A, C, T, G]
    ```

5. **Sequência muito londa:**
    - Entrada: `"ACTGGTACCCAATGATAAAA"`
    - Saída:
    ```plain
    IllegalArgumentException: 
        [PROBLEMA] SEQUENCIA DE CARACTERES MUITO LONGA! 
    
        [INPUT] SEQUENCIA FORNECIDA: ACTGGTACCCAATGATAAAA
        [CALC] CARACTERES TOTAIS: 20
        [CONF] CARACTERES MÁXIMOS CONFIGURADOS: 16
    ```

## Função Esperada:

A função deve seguir esta assinatura:

```python
def contagem_nucleotideos(sequencia: str) -> dict:
    # implementação aqui
```

## Exemplo de Implementação em Python:

Aqui está um exemplo simples de como isso poderia ser implementado em Python:

```python
from collections import Counter

def contagem_nucleotideos(sequencia: str) -> dict:
    return dict(Counter(sequencia))

# Exemplo de uso:
sequencia_dna = "ACGTACGT"
resultado = contagem_nucleotideos(sequencia_dna)
for nucleotideo, contagem in resultado.items():
    print(f"{nucleotideo}: {contagem}")
```