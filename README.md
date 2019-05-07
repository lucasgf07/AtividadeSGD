# SEGURANÇA DE DADOS

## Atividade - Generate Words

Considerando A={0,1,2,3,4,5,6,7} e B= {a,e,i,o,u} e C={b,c,d,f,g,h,j,l,m,n,p,q,r,s,t,v,x,z,k,y}, crie um algorítmo que crie palavras, sem repetição, formadas por: 3 pares de [consoantes(C), vogais (B)] e 2 números obtidos em A. Exemplos: bacana01, gelada99, pikaxu12,pepino32.

## Logica do Algoritimo

O algoritimo busca quebrar o problema em partes, separando os grupos de consoantes, vogais e números em 3 métodos diferentes que retornam apenar um valor aletorio de cada, e o metodo principal que irá imprimir exatamente 10000 palavras aleatórias e sem repetição, verificando se cada palavra pre-formada já está contida na lista de palavras existentes ou não, evitando a repetição.

# Metodos

```
sortearVogal : Separa o grupo de vogais B= {a,e,i,o,u} e sorteia-os aleatoriamente usando random
```

```
sortearConssoante : Separa o grupo de conssoantes C={b,c,d,f,g,h,j,l,m,n,p,q,r,s,t,v,x,z,k,y} e sorteia-os aleatoriamente usando random
```

```
sortearNumero : Separa o grupo de numeros A={0,1,2,3,4,5,6,7} e sorteia-os aleatoriamente usando random
```
# Main

No main e concatenado as Strings que são randomicamente geradas em uma lista que e apresentada no log do sistema.

## Quantas palavras são possíveis de serem criadas? 

```
20 * 20 * 20 * 5 * 5 * 5 * 8 * 8 = 64000000
```
## Equipe 

```
Lucas Garrido , Raul Coelho , Romulo Pereira
```
