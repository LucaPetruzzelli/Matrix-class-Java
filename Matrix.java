public class Matrix {
	private int row;
	private int col; 
	private double matrix[][];
	private int counter=0;
	/**
	 * @param row
	 * @param col
	 * @param matrix
	 */
	
	public Matrix() {
		int row=2;
		int col=2;
		matrix = new double[row][col];
	}
	
	public Matrix(int row, int col) {
		this.row = row;
		this.col = col;
		matrix = new double[row][col];
	}
	
	//METODO ADD(). INSERISCE I VALORI ALL'INTERNO DELLA MATRICE.
	public void add(double value) {
		matrix[(int)counter/col][counter%col]=value;
		counter++;
	}
	
	//METODO AVERAGE(). FA LA MEDIA DEGLI ELEMENTI DELLA MATRICE.
	public double average() {
		int i, j;
		double sum=0;
		for (i=0; i<getRow(); i++) {
			for (j=0; j<getCol(); j++) {
				sum=sum+matrix[i][j];
			}
		}
		return sum/(row*col);
	}
	
	//CAPACITY() RESTITUISCE LA CAPACITA' TOTALE DEL VETTORE.
	public int capacity() {
		return row*col;
	}
	
	//CONTAINS() RESTITUISCE UN BOOLEAN CHE E' TRUE SE IL VALORE E' STATO TROVATO E FALSE SE NON E' STATO TROVATO.
	public boolean contains(double value) {
		int i, j;
		boolean flag=false;
		for (i=0; i<getRow(); i++) {
			for (j=0; j<getCol(); j++) {
				if (matrix[i][j]==value) {
					flag=true;
				}
			}
		}
		return flag;
	}
	
	//ELEMENTAT() RESTITUISCE L'ELEMENTO CON I VALORI DEI PARAMETRI INDICATI (RIGA E COLONNA).
	public double elementAt(int indexRow, int indexCol) {
		return matrix[indexRow-1][indexCol-1];
	}
	
	//FIRSTELEMENT() RESTITUISCE IL PRIMO ELEMENTO DELLA MATRICE, LASTELEMENT() L'ULTIMO.
	public double firstElement() {
		return matrix[0][0];
	}
	
	public double lastElement() {
		return matrix[row-1][col-1];
	}
	
	//ROWOF() RESTITUISCE LA RIGA DELLA PRIMA OCCORRENZA DELL'ELEMENTO, COLOF() LA COLONNA.
	public int rowOf(double value) {
		int i, j;
		for (i=0; i<getRow(); i++) {
			for (j=0; j<getCol(); j++) {
				if (matrix[i][j]==value) {
					return i+1;
				}
			}
		}
		return -1;
	}
	
	public int colOf(double value) {
		int i, j;
		for (i=0; i<getRow(); i++) {
			for (j=0; j<getCol(); j++) {
				if (matrix[i][j]==value) {
					return j+1;
				}
			}
		}
		return -1;
	}
	
	//MIN() E MAX() RESTITUISCONO RISPETTIVAMENTE I VALORI MINIMO E MASSIMO TRA QUELLI PRESENTI NELLA MATRICE.
	public double max() {
		int i, j;
		double max=matrix[0][0];
		for (i=0; i<getRow(); i++) {
			for (j=1; j<getCol(); j++) {
				if(matrix[i][j]>max) {
					max=matrix[i][j];
				}
			}
		}
		return max;
	}
	
	public double min() {
		int i, j;
		double min=matrix[0][0];
		for (i=0; i<getRow(); i++) {
			for (j=1; j<getCol(); j++) {
				if(matrix[i][j]<min) {
					min=matrix[i][j];
				}
			}
		}
		return min;
	}
	
	//NUMBEROF() RESTITUISCE UN INTERO CHE INDICA QUANTE VOLTE L'ELEMENTO SPECIFICATO E' PRESENTE NELLA MATRICE.
	public int numberOf(double value) {
		int i, j, counter=0;
		for (i=0;i<getRow(); i++) {
			for (j=0; j<getCol(); j++) {
				if (matrix[i][j]==value) {
					counter++;
				}
			}
		}
		return counter;
	}
	
	//SCALARPRODUCT() EFFETTUA IL PRODOTTO SCALARE DELL'INTERA MATRICE, RESTITUENDONE UNA STRINGA CON TUTTI I VALORI.
	public String scalarProduct(double multi) {
		double[][] matrix1 = new double[row][col];
		int i, j;
		String matrix1_string="";
		for (i=0; i<getRow(); i++) {
			for (j=0; j<getCol(); j++) {
				matrix1[i][j]=matrix[i][j]*multi;
				if(getRow()-i==1 && getCol()-j==1) {
					matrix1_string=matrix1_string+matrix1[i][j];
				} else {
					matrix1_string=matrix1_string+matrix1[i][j]+", ";
				}
			}
		}
		return matrix1_string;
	}
	
	//SUM() EFFETTUA LA SOMMA TRA TUTTI I VALORI PRESENTI NELLA MATRICE.
	public double sum() {
		int i, j;
		double sum=0;
		for (i=0; i<getRow(); i++) {
			for (j=0; j<getCol(); j++) {
				sum=sum+matrix[i][j];
			}
		}
		return sum;
	}
	
	public double get(int indexRow, int indexCol) {
		return matrix[indexRow-1][indexCol-1];
	}
	
	public int getRow() {
		return row;
	}
	
	public int getCol() {
		return col;
	}
	
	public double[][] getMatrix() {
		return matrix;
	}
	
	//SET() MODIFICA UN ELEMENTO DELLA MATRICE CON I 3 PARAMETRI SPECIFICATI (VALORE DEL NUOVO ELEMENTO, RIGA E COLONNA A CUI ASSEGNARLO).
	public void set(double value, int indexRow, int indexCol) {
		matrix[indexRow-1][indexCol-1]=value;
	}
		
	public void setMatrix(double[][] matrix) {
		this.matrix = matrix;
	}
	
	//TOARRAY() RESTITUISCE UNA STRINGA DI UN VETTORE CON AL SUO INTERNO TUTTI GLI ELEMENTI DELLA MATRICE.
	public String toArray() {
		double[] vector=new double[capacity()];
		int i, j, z=0;
		String array_string="";
		for (i=0; i<getRow(); i++) {
			for (j=0; j<getCol(); j++) {
				vector[z]=matrix[i][j];
				if(getRow()-i==1 && getCol()-j==1) {
					array_string=array_string+vector[z];
				} else {
					array_string=array_string+vector[z]+", ";
				}
				z++;
			}
		}
		return array_string;
	}
	
	//TOSTRING() RESTITUISCE UNA STRINGA CON TUTTI I VALORI ALL'INTERNO DELLA MATRICE.
	public String toString() {
		int i;
		int j;
		String matrixString="";
		for (i=0; i<getRow(); i++) {
			for (j=0; j<getCol(); j++) {
				if (getRow()-i==1 && getCol()-j==1) {
					matrixString=matrixString+matrix[i][j];
				} else {
					matrixString=matrixString+matrix[i][j]+", ";
				}
			}
		}
		return matrixString;
	}
}