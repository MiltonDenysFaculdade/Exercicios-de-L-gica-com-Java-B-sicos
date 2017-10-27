import java.util.*;
public class Exercicios_Aula_1 {
	
	Scanner input = new Scanner(System.in);
	
	public void Fahreinheit() {
	double c,f;	
	System.out.println("Digite os graus em Celsius:");
	c = input.nextDouble();
	f = (9*c+160)/5;
	System.out.println("Resultado em Fahreinheit: "+ f);	
	}
	public void Gas(){
	double tempo,velocidade,distancia,litros_usados;
	
	System.out.println("Digite o tempo de viagem em horas: ");
	tempo = input.nextDouble();
	System.out.println("Digite a velocidade em que foi feita a viagem ");
	velocidade = input.nextDouble();
	distancia = tempo*velocidade;
	litros_usados = distancia/12;
	
	System.out.println("A viagem foi de : " + tempo+ " horas");
	System.out.println("A velocidade média foi de : " + velocidade + " KM/H");
	System.out.println("A distancia foi de : " + distancia + " KM");
	System.out.println("A quantidade de litros de gasolina foi de : " + litros_usados);
	}
	public void soma(){
		int a,b,c,d,soma,mult;
		System.out.println("Digite o valor para A: ");
		a = input.nextInt();
		System.out.println("Digite o valor para B: ");
		b = input.nextInt();
		System.out.println("Digite o valor para C: ");
		c = input.nextInt();
		System.out.println("Digite o valor para D: ");
		d = input.nextInt();
		
		System.out.println("A + B = " + (a+b) + " A + C = "+ (a+c)+" A + D = "+(a+d)  
				+ " B + C = "+ (b+c)+ " B + D = "+ (b+d)+ " C + D = "+(c+d));
		System.out.println("A X B = " + a*b + " A X C = "+ a*c+" A X D = "+a*d  
				+ " B X C = "+ b*c+" B X D = "+ b*d+" C X D = "+c*d);	
}
	public void trocaAB(){
		int a,b,temp;
		System.out.println("Digite o valor para A: ");
		a = input.nextInt();
		System.out.println("Digite o valor para B: ");
		b = input.nextInt();
		
		temp = a;
		a = b;
		b=temp;
		
		System.out.println("Valor de A:" + a + "\nValor de B:"+ b );				
	}	
		public void caixa(){
			int volume;
			int comprimento = 10;
			int largura = 10;
			int altura = 10;
		
			volume = comprimento*largura*altura;
			System.out.println(volume);	
		}

		public void Celsius(){
			double c;
			double f;
			System.out.println("Digite a temperatura em Fahreinheit:");
			f = input.nextDouble();
			c = ((f-32)*5/9);
			System.out.println("Resultado em Celcius: " + c);
			
		}
		public void Oleo(){
			double raio;
			double altura;
			double volume;
			System.out.println("Digite o valor do raio: ");
			raio = input.nextDouble();
			System.out.println("Digite o valor da altura: ");
			altura = input.nextDouble();
			
			volume = 3.14159 * Math.sqrt(raio)*altura;
			System.out.println("Resultado do volume: "+ volume);
			
		}
		public void PrestacaoAtraso(){
			double valor,prestacao;
			double taxa = 1;
			int tempo;
			System.out.println("Digite o valor das parcelas: ");
			valor = input.nextDouble();
			System.out.println("Digite o numero de dias em atraso: ");
			tempo = input.nextInt();
			
			prestacao = valor+(valor*(taxa/100)*tempo);
				
			System.out.println("O valor corrigido é de: " + prestacao);
			
		}
		public void raizQuadrada(){
			double n1,res;
			System.out.println("Digite o numero: ");
			n1= input.nextInt();
			res = Math.sqrt(n1);
			System.out.println("Raiz quadrada de "+ n1 + " = "+ res);
		}
		public void raizQuadrada1(){
			double n1,n2,res;
			System.out.println("Dgite o primeiro número: ");
			n1 = input.nextDouble();
			System.out.println("Dgite o segundo número: ");
			n2 = input.nextDouble();
			
			res = n1%n2;
			System.out.println("Quadrado da diferenca: "+Math.sqrt(res));
		}
		public void realDolar(){
				
			double dolar,real,cotacao;
			System.out.println("Digite o valor da cotação do dolar");
			cotacao = input.nextDouble();
			System.out.println("Digite a quantidade de dólares: ");
			dolar = input.nextDouble();			
			real = cotacao*dolar;
			System.out.println("Valor convertido para Real: "+real);
					
			}
		public void dolarReal(){
			
			double dolar,real,cotacao;
			System.out.println("Digite o valor da cotação do real");
			cotacao = input.nextDouble();
			System.out.println("Digite a quantidade de reais: ");
			real = input.nextDouble();			
			dolar = cotacao*real;
			System.out.println("Valor convertido para dólares: "+dolar);
					
			}
			public void quadradosSomados(){
				double a,b,c,res,res1;
				System.out.println("Digite o valor do primeiro número: ");
				a = input.nextInt();
				System.out.println("Digite o valor do segundo número: ");
				b = input.nextInt();
				System.out.println("Digite o valor do terceiro número: ");
				c = input.nextInt();
				
				res = Math.sqrt(a)+Math.sqrt(b)+Math.sqrt(c);
				res1 =Math.sqrt(a+b+c);
				System.out.println("Resultado das somas dos quadrados: "+res);
				System.out.println("Resultado do quadrado da soma dos números: "+ res1);				
			}
		
			public void produtoSoma(){
				int a,b,c,d,p,s;
				System.out.println("Digite o valor do primeiro número: ");
				a = input.nextInt();
				System.out.println("Digite o valor do segundo número: ");
				b = input.nextInt();
				System.out.println("Digite o valor do terceiro número: ");
				c = input.nextInt();
				System.out.println("Digite o valor do quarto número: ");
				d = input.nextInt();
				
				p = a*c;
				s = b+d;
				System.out.println("Produto a * c = " + p);
				System.out.println("Soma b * d = " + s);
			}
			
			public void reajusteSalarial(){
				
				double sm,pr,reajuste;
				System.out.println("Digite o valor do salario mensal");
				sm = input.nextDouble();
				System.out.println("Digite o valor do reajuste: ");
				pr = input.nextDouble();			
				reajuste = sm+pr;
				System.out.println("Valor atualizado com reajustes: "+reajuste);
				
			}

			public void circunferencia(){
				double raio;
				double area;
				System.out.println("Digite o valor do raio: ");
				raio = input.nextDouble();
				area  = 3.14159 * Math.sqrt(raio);
				System.out.println("Valor área da circunferência: "+ area);			
			}
			
			public void eleicao(){
				int lula, bolsonaro,aecio,nulos,brancos;
				int somaVotos;
				System.out.println("Entre com a quantidade de votos nulos:");
				nulos = input.nextInt();
				System.out.println("Entre com a quantidade de votos brancos:");
				brancos = input.nextInt();
				System.out.println("Entre com a quantidade de votos do candidato Lula:");
				lula = input.nextInt();
				System.out.println("Entre com a quantidade de votos do candidato Bolsonaro:");
				bolsonaro = input.nextInt();
				System.out.println("Entre com a quantidade de votos do candidato Aecio:");
				aecio = input.nextInt();
				
				somaVotos =  lula+bolsonaro+aecio+nulos+brancos;
				System.out.println("Quantidade total de votos: " + somaVotos);

				
				double porcentagemCandidatos =((lula+aecio+bolsonaro)*100/somaVotos);
				double porcentagemLula = lula*100/somaVotos;
				double porcentagemBolsonaro = bolsonaro*100/somaVotos;	
				double porcentagemAecio = aecio*100/somaVotos;
				double porcentagemNulos = nulos*100/somaVotos;
				double porcentagemBrancos = brancos*100/somaVotos;
				
				System.out.println("Porcentagem de votos válidos: "+ porcentagemCandidatos);
				System.out.println("Porcentagem de votos no candidato Lula: "+ porcentagemLula);
				System.out.println("Porcentagem de votos no candidato Bolsonaro: "+ porcentagemBolsonaro);
				System.out.println("Porcentagem de votos no candidato Aecio: "+ porcentagemAecio);
				System.out.println("Porcentagem de votos Nulos: "+ porcentagemNulos);
				System.out.println("Porcentagem de votos Brancos: "+ porcentagemBrancos);
			
			}
			
			
			
			
			
			

}
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
			
		
































