# Conversor de moedas e temperatura | Java

![Badge versão do programa](https://img.shields.io/badge/version-1.0-9cf?style=for-the-badge "Version") 
![Badge GitHub stars](https://img.shields.io/github/stars/xLucaspx/conversor-java?style=for-the-badge "Stars") 
![Badge GitHub issues](https://img.shields.io/github/issues/xLucaspx/conversor-java?style=for-the-badge "Issues")

Um conversor de moedas e temperatura desenvolvido com Java (JDK 18) e utilizando JOptionpane para a interface gráfica.

<p align="center">
  <img src="https://user-images.githubusercontent.com/102704083/193341121-66e27351-bcaf-4e9b-b799-96218d1faa8d.jpg" alt="Tela inicial do conversor" title="Tela inicial do conversor">
</p>

## Índice

- [Conversão de moedas](#convertendo-moedas)
- [Conversão de temperatura](#convertendo-temperatura)
- [Valor inválido/finalização do programa](#alerta-e-encerramento)
- [Acesso ao projeto](#acesso-ao-projeto)

## Convertendo moedas

Após selecionar a opção "Converter moeda", é possível realizar as seguintes operações:
- Real para Dólar - Dólar para Real
- Real para Euro - Euro para Real
- Real para Libra Esterlina - Libra Esterlina para Real
- Real para Peso Argentino - Peso Argentino para Real
- Real para Peso Chileno - Peso Chileno para Real

Depois de selecionar a operação, insira o valor que deseja converter (apenas números, positivos ou negativos, com ponto flutuante) e o programa mostrará o resultado.

<p align="center">
  <img src="https://user-images.githubusercontent.com/102704083/193343421-33e03d41-178e-4cbd-a82e-d3c72e7c8607.jpg" alt="Tela de escolha da operação" title="Tela de escolha da operação">
  <img src="https://user-images.githubusercontent.com/102704083/193343635-5813bf0c-631a-4670-a070-60a74098fbf1.jpg" alt="Tela de input do valor" title="Tela de input do valor">
  <img src="https://user-images.githubusercontent.com/102704083/193343765-746bc5cd-bd70-4167-9235-b0895c999363.jpg" alt="Tela de resultado da operação" title="Tela de resultado da operação">
</p>

## Convertendo temperatura

Após selecionar a opção "Converter temperatura", é possível realizar as seguintes operações:
- Celsius para Fahrenheit
- Celsius para Kelvin
- Fahrenheit para Celsius
- Fahrenheit para Kelvin
- Kelvin para Celsius
- Kelvin para Fahrenheit

Depois de selecionar a operação, insira o valor que deseja converter (apenas números, positivos ou negativos, com ponto flutuante) e o programa mostrará o resultado.


<p align="center">
  <img src="https://user-images.githubusercontent.com/102704083/193346397-bc7205cf-7e3f-40ab-adf8-b93f045b2020.jpg" alt="Tela de escolha da operação" title="Tela de escolha da operação">
  <img src="https://user-images.githubusercontent.com/102704083/193346393-6a13ec2a-7cb1-495c-9188-c70d6f4637dc.jpg" alt="Tela de input do valor" title="Tela de input do valor">
  <img src="https://user-images.githubusercontent.com/102704083/193346395-4dba43c3-459a-4eb8-9532-af7c49bb7cc9.jpg" alt="Tela de resultado da operação" title="Tela de resultado da operação">
</p>

### Alerta e encerramento

Caso seja inserido um valor inválido (não numérico) ou não seja inserido valor nenhum, o programa mostrará uma mensagem de alerta para o usuário.
Sempre após o alerta ou uma operação bem sucedida, o programa deverá perguntar ao usuário se ele deseja continuar; em caso afirmativo, o programa retorna a tela inicial, mas caso o usuário clique em "Não", o programa exibe uma mensagem de finalização e é encerrado.

<p align="center">
  <img src="https://user-images.githubusercontent.com/102704083/193346489-84e8e347-a02b-42d2-9162-6fbe3ca94d0b.jpg" alt="Tela de alerta" title="Tela de alerta">
  <img src="https://user-images.githubusercontent.com/102704083/193346480-8a9b59a6-5f9a-4772-9b3c-c5bd86926c4c.jpg" alt="Tela de continuação" title="Tela de continuação">
  <img src="https://user-images.githubusercontent.com/102704083/193346485-714b4e74-0996-4f2b-a18c-383d0ad31871.jpg" alt="Tela de finalização" title="Tela de finalização">
</p>

### Acesso ao projeto

📁 Download do projeto completo (.zip): [Baixar projeto](https://github.com/xLucaspx/conversor-java/archive/refs/heads/main.zip "Baixar projeto .zip")

💾 Download apenas do arquivo executável (.jar): [Baixar arquivo](https://github.com/xLucaspx/conversor-java/raw/main/Conversor.jar "Baixar arquivo .jar")

Talvez seja necessário ter a versão 18 ou superior do java para rodar o programa.
