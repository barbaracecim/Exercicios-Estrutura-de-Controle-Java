


### **Comandos para criar o README e enviar tudo para o GitHub**

No **Git Bash**, dentro da pasta dos exercícios, rode:

# Inicializa o Git (caso ainda não tenha feito)
git init

# Cria o README com o conteúdo acima
echo "# 📝 Exercícios de Estruturas de Controle em Java

Este repositório contém os exercícios que desenvolvi durante o estudo do **módulo de Estruturas de Controle na Linguagem Java**, como parte do curso da [Digital Innovation One (DIO)](https://www.dio.me/).

---

## 📚 O que estou aprendendo neste módulo

Neste módulo, os exercícios abordam conceitos fundamentais sobre **controle de fluxo** em Java, incluindo:

- 🔀 **Estruturas condicionais** (\`if\`, \`else if\`, \`else\`, \`switch\`)  
- 🔁 **Laços de repetição** (\`for\`, \`while\`, \`do-while\`)  
- 🧠 **Tomada de decisão com operadores lógicos**  
- 📥 **Entrada de dados via terminal**  
- 📤 **Saída de dados formatada (\`System.out.println\`)**

Esses exercícios ajudam a entender como controlar o fluxo e a lógica dos programas Java.

---

## 🚀 Como executar os exercícios

1. Instale o **Java JDK 17+**: [Baixar aqui](https://www.oracle.com/java/technologies/downloads/).  
2. Clone este repositório:
   \`\`\`bash
   git clone https://github.com/barbaracecim/NOME-DO-REPOSITORIO.git
   \`\`\`
3. Acesse a pasta:
   \`\`\`bash
   cd NOME-DO-REPOSITORIO
   \`\`\`
4. Compile e execute qualquer exercício:
   \`\`\`bash
   javac Exercicio1Calculadora/Exercicio1.java
   java Exercicio1Calculadora.Exercicio1
   \`\`\`

---

## 📂 Estrutura do projeto

\`\`\`
EstruturasDeControle/
├── Exercicio1Calculadora/
├── Exercicio2CalculoIMC/
├── Exercicio3IntervaloParImpar/
└── Exercicio4Divisibilidade/
\`\`\`

Cada pasta contém um exercício separado com seu próprio código.

---

## 🛠 Tecnologias usadas

- **Java (JDK 17+)**  
- **Git & GitHub**  
- **IDE (IntelliJ IDEA, Eclipse ou VSCode)**

---

## 📌 Como atualizar com novos exercícios

Sempre que eu criar novos exercícios, basta rodar os comandos:

\`\`\`bash
git add .
git commit -m "Adicionando novos exercícios"
git push
\`\`\`

---

Feito com ❤️ enquanto aprendo Java e pratico **Estruturas de Controle**!" > README.md

# Adiciona todos os arquivos
git add .

# Faz o commit
git commit -m "Adicionando exercícios e README"

# Conecta com o repositório (substitua pelo link certo)
git branch -M main
git remote add origin https://github.com/barbaracecim/NOME-DO-REPOSITORIO.git

# Envia para o GitHub
git push -u origin main
