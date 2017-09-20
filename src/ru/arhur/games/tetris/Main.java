package ru.arhur.games.tetris;

import java.util.Random;

public class Main {
	public static final int WIDTH = 10;
	public static final int HEIGHT = 21;
	public static final String EMPTY_CELL = "[]";
	public static final String VALID_CELL = "@ ";
	public static int score;
	public static int firstFigureLine = 0;
	public static int secondFigureLine = 0;
	public static int thirdFigureLine = 0;
	public static int fourthFigureLine = 0;
	public static int figureLine_x1 = 0;
	public static int figureLine_x2 = 1;
	public static int figureLine_x3 = 2;
	public static int figureLine_x4 = 3;
	public String field[][] = new String[HEIGHT][WIDTH];
	public String lastField[][] = new String[HEIGHT][WIDTH];

	public static void main(String[] args) {
		Main main = new Main();
		main.initField();
		main.getFigure();
		for (int i = 0; i < HEIGHT; i++) {
			main.moveFugure(main);
		}
		main.copyArrays();
		main.getFigure();
		for (int i = 0; i < HEIGHT; i++) {
			main.moveFugure(main);
		}
		main.copyArrays();
		main.getFigure();
		for (int i = 0; i < HEIGHT; i++) {
			main.moveFugure(main);
		}
		main.copyArrays();
		main.getFigure();
		for (int i = 0; i < HEIGHT; i++) {
			main.moveFugure(main);
		}
		main.copyArrays();
		main.getFigure();
		for (int i = 0; i < HEIGHT; i++) {
			main.moveFugure(main);
		}
		main.copyArrays();
		main.getFigure();
		for (int i = 0; i < HEIGHT; i++) {
			main.moveFugure(main);
		}
		main.copyArrays();
		main.getFigure();
		for (int i = 0; i < HEIGHT; i++) {
			main.moveFugure(main);
		}
		main.copyArrays();
	}

	private void initField() {
		for (int i = 0; i < HEIGHT; i++) {
			for (int j = 0; j < WIDTH; j++) {
				field[i][j] = EMPTY_CELL;
			}
		}
	}

	private void startGame() {
		for (int i = 1; i < HEIGHT; i++) {
			System.out.println("");
			for (int j = 0; j < WIDTH; j++) {
				System.out.print(field[i][j]);
			}
		}
		System.out.println("");
	}

	private void checkLine() { // Пробегаем по массиву и проверям на заполненность
		int check = 0;
		for (int i = 0; i < HEIGHT; i++) {
			for (int j = 0; j < WIDTH; j++) {
				if (field[i][j].equals(VALID_CELL)) {
					check++;
				}
				if (field[i][j].equals(EMPTY_CELL)) {
					check = 0;
					return;
				}
			}
			if (check == 10) {
				for (int j = 0; j < WIDTH; j++) {
					field[i][j] = EMPTY_CELL;
				}
				score = score + check;
				check = 0;
			}
		}
	}

	void moveFugure(Main main){
		if(1==1){//Какой то метод, который проверяет столкновение и столкновение с самым низом
			main.startGame();
			System.out.println("Ваши очки= " + main.score);
			for (int i = 0; i < 16; i++) { //Далее с нижней матрицы проверяется наличие заполненной ячейки
										   //И передвигает её на единицу вниз.
				int endMove=0;
				if(i==0 && fourthFigureLine<HEIGHT-1){
					if(field[fourthFigureLine][figureLine_x1].equals(VALID_CELL) && !field[fourthFigureLine+1][figureLine_x1].equals(VALID_CELL)){
						field[fourthFigureLine+1][figureLine_x1]=field[fourthFigureLine][figureLine_x1];
						field[fourthFigureLine][figureLine_x1]=EMPTY_CELL;
					}if(fourthFigureLine==HEIGHT) {
						endMove++;
					}
				}if(i==1 && fourthFigureLine<HEIGHT-1){
					if(field[fourthFigureLine][figureLine_x2].equals(VALID_CELL)  && !field[fourthFigureLine+1][figureLine_x2].equals(VALID_CELL)){
						field[fourthFigureLine+1][figureLine_x2]=field[fourthFigureLine][figureLine_x2];
						field[fourthFigureLine][figureLine_x2]=EMPTY_CELL;
					}if(fourthFigureLine==HEIGHT) {
						endMove++;
					}
				}if(i==2 && fourthFigureLine<HEIGHT-1){
					if(field[fourthFigureLine][figureLine_x3].equals(VALID_CELL)  && !field[fourthFigureLine+1][figureLine_x3].equals(VALID_CELL)){
						field[fourthFigureLine+1][figureLine_x3]=field[fourthFigureLine][figureLine_x3];
						field[fourthFigureLine][figureLine_x3]=EMPTY_CELL;
					}if(fourthFigureLine==HEIGHT) {
						endMove++;
					}
				}if(i==3 && fourthFigureLine<HEIGHT-1){
					if(field[fourthFigureLine][figureLine_x4].equals(VALID_CELL)  && !field[fourthFigureLine+1][figureLine_x4].equals(VALID_CELL)){
						field[fourthFigureLine+1][figureLine_x4]=field[fourthFigureLine][figureLine_x4];
						field[fourthFigureLine][figureLine_x4]=EMPTY_CELL;
					}if(fourthFigureLine==HEIGHT) {
							endMove++;
						}
				}if(endMove>0) {
					return;
				}if(i==4 && thirdFigureLine<HEIGHT-1){
					if(field[thirdFigureLine][figureLine_x1].equals(VALID_CELL)  && !field[thirdFigureLine+1][figureLine_x1].equals(VALID_CELL)){
						field[thirdFigureLine+1][figureLine_x1]=field[thirdFigureLine][figureLine_x1];
						field[thirdFigureLine][figureLine_x1]=EMPTY_CELL;
					}if(thirdFigureLine==HEIGHT) {
						endMove++;
					}
				}if(i==5 && thirdFigureLine<HEIGHT-1){
					if(field[thirdFigureLine][figureLine_x2].equals(VALID_CELL)   && !field[thirdFigureLine+1][figureLine_x2].equals(VALID_CELL)){
						field[thirdFigureLine+1][figureLine_x2]=field[thirdFigureLine][figureLine_x2];
						field[thirdFigureLine][figureLine_x2]=EMPTY_CELL;
					}if(thirdFigureLine==HEIGHT) {
						endMove++;
					}
				}if(i==6 && thirdFigureLine<HEIGHT-1){
					if(field[thirdFigureLine][figureLine_x3].equals(VALID_CELL)   && !field[thirdFigureLine+1][figureLine_x3].equals(VALID_CELL)){
						field[thirdFigureLine+1][figureLine_x3]=field[thirdFigureLine][figureLine_x3];
						field[thirdFigureLine][figureLine_x3]=EMPTY_CELL;
					}if(thirdFigureLine==HEIGHT) {
						endMove++;
					}
				}if(i==7 && thirdFigureLine<HEIGHT-1){
					if(field[thirdFigureLine][figureLine_x4].equals(VALID_CELL)   && !field[thirdFigureLine+1][figureLine_x4].equals(VALID_CELL)){
						field[thirdFigureLine+1][figureLine_x4]=field[thirdFigureLine][figureLine_x4];
						field[thirdFigureLine][figureLine_x4]=EMPTY_CELL;
					}if(thirdFigureLine==HEIGHT) {
						endMove++;
					}
				}if(endMove>0) {
					return;
				}if(i==8){
					if(secondFigureLine==HEIGHT-1) {
						endMove++;
					}else if(field[secondFigureLine][figureLine_x1].equals(VALID_CELL)   && !(field[secondFigureLine+1][figureLine_x1].equals(VALID_CELL))){
						field[secondFigureLine+1][figureLine_x1]=field[secondFigureLine][figureLine_x1];
						field[secondFigureLine][figureLine_x1]=EMPTY_CELL;
					}
				}if(i==9){
					if(secondFigureLine==HEIGHT-1) {
						endMove++;
					}else if(field[secondFigureLine][figureLine_x2].equals(VALID_CELL)    && 	!(field[secondFigureLine+1][figureLine_x2].equals(VALID_CELL))){
						field[secondFigureLine+1][figureLine_x2]=field[secondFigureLine][figureLine_x2];
						field[secondFigureLine][figureLine_x2]=EMPTY_CELL;
					}
				}if(i==10){
					if(secondFigureLine==HEIGHT-1) {
					endMove++;
					}else if(field[secondFigureLine][figureLine_x3].equals(VALID_CELL)    && !field[secondFigureLine+1][figureLine_x3].equals(VALID_CELL)){
							field[secondFigureLine+1][figureLine_x3]=field[secondFigureLine][figureLine_x3];
							field[secondFigureLine][figureLine_x3]=EMPTY_CELL;
						}
				}if(i==11){
					if(secondFigureLine==HEIGHT-1) {
						endMove++;
					}else if(field[secondFigureLine][figureLine_x4].equals(VALID_CELL)    && !field[secondFigureLine+1][figureLine_x4].equals(VALID_CELL)){
						field[secondFigureLine+1][figureLine_x4]=field[secondFigureLine][figureLine_x4];
						field[secondFigureLine][figureLine_x4]=EMPTY_CELL;
					}
				}if(endMove>0) {
					return;
				}if(i==12 && firstFigureLine<HEIGHT-1){
					if(field[firstFigureLine][figureLine_x1].equals(VALID_CELL)    && !field[firstFigureLine+1][figureLine_x1].equals(VALID_CELL)){
						field[firstFigureLine+1][figureLine_x1]=field[firstFigureLine][figureLine_x1];
						field[firstFigureLine][figureLine_x1]=EMPTY_CELL;
					}
				}if(i==13 && firstFigureLine<HEIGHT-1){
					if(field[firstFigureLine][figureLine_x2].equals(VALID_CELL)    && !field[firstFigureLine+1][figureLine_x2].equals(VALID_CELL)){
						field[firstFigureLine+1][figureLine_x2]=field[firstFigureLine][figureLine_x2];
						field[firstFigureLine][figureLine_x2]=EMPTY_CELL;
					}
				}if(i==14 && firstFigureLine<HEIGHT-1){
					if(field[firstFigureLine][figureLine_x3].equals(VALID_CELL)    && !field[firstFigureLine+1][figureLine_x3].equals(VALID_CELL)){
						field[firstFigureLine+1][figureLine_x3]=field[firstFigureLine][figureLine_x3];
						field[firstFigureLine][figureLine_x3]=EMPTY_CELL;
					}
				}if(i==15  && firstFigureLine<HEIGHT-1){
					if(field[firstFigureLine][figureLine_x4].equals(VALID_CELL)    && !field[firstFigureLine+1][figureLine_x4].equals(VALID_CELL)){
						field[firstFigureLine+1][figureLine_x4]=field[firstFigureLine][figureLine_x4];
						field[firstFigureLine][figureLine_x4]=EMPTY_CELL;
					}
			}
			}
			firstFigureLine++;
			secondFigureLine++;
			thirdFigureLine++;
			fourthFigureLine++;
		}else return;
	}

	public void copyArrays() {
		for (int i = 0; i < HEIGHT; i++) {
			for (int j = 0; j < WIDTH; j++) {
				lastField[i][j] = field[i][j];
			}
		}
	}

	boolean checkAllFigure(int x, int y) {
		for (int i = 19; i > 0; i--) {
			for (int j = 0; j < WIDTH; j++) {
			}
		}
		return false;
	}

	private void getFigure() { // Добавляем к нашему полю фигуру
		firstFigureLine = 0;
		secondFigureLine = 1;
		thirdFigureLine = 2;
		fourthFigureLine = 3;
		Random rnd = new Random();
		int a = rnd.nextInt(6);
		if (a == 0) {
			field[firstFigureLine][figureLine_x1 = 3] = VALID_CELL;
			field[firstFigureLine][figureLine_x2 = 4] = VALID_CELL;
			field[firstFigureLine][figureLine_x3 = 5] = VALID_CELL;
			field[secondFigureLine][figureLine_x4 = 4] = VALID_CELL;
		}
		if (a == 1) {
			field[firstFigureLine][figureLine_x1 = 3] = VALID_CELL;
			field[firstFigureLine][figureLine_x2 = 4] = VALID_CELL;
			field[firstFigureLine][figureLine_x3 = 5] = VALID_CELL;
			field[firstFigureLine][figureLine_x4 = 6] = VALID_CELL;
		}
		if (a == 2) {
			field[firstFigureLine][figureLine_x1 = 3] = VALID_CELL;
			field[firstFigureLine][figureLine_x2 = 4] = VALID_CELL;
			field[secondFigureLine][figureLine_x3 = 4] = VALID_CELL;
			field[secondFigureLine][figureLine_x4 = 5] = VALID_CELL;
		}
		if (a == 3) {
			field[firstFigureLine][figureLine_x1 = 3] = VALID_CELL;
			field[firstFigureLine][figureLine_x2 = 4] = VALID_CELL;
			field[secondFigureLine][figureLine_x3 = 3] = VALID_CELL;
			field[secondFigureLine][figureLine_x4 = 4] = VALID_CELL;
		}
		if (a == 4) {
			field[firstFigureLine][figureLine_x1 = 3] = VALID_CELL;
			field[secondFigureLine][figureLine_x2 = 3] = VALID_CELL;
			field[secondFigureLine][figureLine_x3 = 4] = VALID_CELL;
			field[secondFigureLine][figureLine_x4 = 5] = VALID_CELL;
		}
		if (a == 5) {
			field[firstFigureLine][figureLine_x1 = 3] = VALID_CELL;
			field[secondFigureLine][figureLine_x2 = 3] = VALID_CELL;
			field[secondFigureLine][figureLine_x3 = 4] = VALID_CELL;
			field[secondFigureLine][figureLine_x4 = 5] = VALID_CELL;
		}
	}
}
