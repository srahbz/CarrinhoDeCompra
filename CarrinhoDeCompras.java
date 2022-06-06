import java.util.Scanner;

import javax.swing.JOptionPane;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class CarrinhoDeCompras {

	public static void main(String[] args) {
		String carrinho[];
		carrinho = new String[10];
		int valor;
		int valorTotal = 0;
		int itens = 1;
		int continuar = 1;
		int n100 = 0, n50 = 0, n20 = 0, n10 = 0, n5 = 0, n2 = 0, n1 = 0;

		while (itens <= 10) {
			if (continuar == 1) {
				String nomeProduto = JOptionPane.showInputDialog("Qual o produto a ser adicionado?");
				if (nomeProduto == "" || nomeProduto == null || nomeProduto.isEmpty()) {
					break;
				} else {
					carrinho[itens - 1] = nomeProduto;
				}

				itens++;
				while (true) {
					try {
						valor = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor do produto?"));
						valorTotal += valor;
					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Valor invalido \n Insira um valor valido");
						continue;
					}
					break;
				}
				continuar = Integer.parseInt(JOptionPane.showInputDialog("Comprar mais produtos ? \n 1- (sim/yes) 2- (não/no)"));

			}
			if (continuar != 1 && continuar != 2) {
				continuar = Integer.parseInt(JOptionPane.showInputDialog("Valor invalido \n Insira um valor valido"));

			}
			if (continuar == 2) {
				break;
			}
		}
		String str = "";
		for (int i = 0; i < carrinho.length; i++) {
			if (carrinho[i] != null) {
				str += (">" + carrinho[i] + "\n");
			}
		}
		JOptionPane.showMessageDialog(null, "Produtos do carrinho\n" + str);
		JOptionPane.showMessageDialog(null, "Valor Total: " + "\n" + valorTotal + "\n");

		String str2 = "";
		while (valorTotal != 0) {

			if (valorTotal >= 100) {
				n100 = valorTotal / 100;
				valorTotal = valorTotal % 100;

			} else if (valorTotal >= 50) {
				n50 = valorTotal / 50;
				valorTotal = valorTotal % 50;

			} else if (valorTotal >= 20) {
				n20 = valorTotal / 20;
				valorTotal = valorTotal % 20;

			} else if (valorTotal >= 10) {
				n10 = valorTotal / 10;
				valorTotal = valorTotal % 10;

			} else if (valorTotal >= 5) {
				n5 = valorTotal / 5;
				valorTotal = valorTotal % 5;

			} else if (valorTotal >= 2) {
				n2 = valorTotal / 2;
				valorTotal = valorTotal % 2;
			} else if (valorTotal >= 1) {
				n1 = valorTotal / 1;
				valorTotal = valorTotal % 1;

			}
		}
		if (n100 >= 1) {
			str2 += (n100 + " notas de R$100\n");
		}
		if (n50 >= 1) {
			str2 += (n50 + " notas de R$50\n");
		}
		if (n20 >= 1) {
			str2 += (n20 + " notas de R$20\n");
		}
		if (n10 >= 1) {
			str2 += (n10 + " notas de R$10\n");
		}
		if (n5 >= 1) {
			str2 += (n5 + " notas de R$5\n");
		}
		if (n2 >= 1) {
			str2 += (n2 + " notas de R$2\n");
		}
		if (n1 >= 1) {
			str2 += (n1 + " moedas de R$1\n");
		}
		JOptionPane.showMessageDialog(null, "Notas\n" + str2);

	}

}