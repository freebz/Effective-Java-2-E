// 점층적 생성자 패턴 - 더 많은 인자 개수에 잘 적응하지 못한다.
public class NutritionFacts {
    private final int servingSize;   // (mL)               필수
    private final int servings;      // (per container)    필수
    private final int calories;      //                    선택
    private final int fat;           // (g)                선택
    private final int sodium;        // (mg)               선택
    private final int carbohydrate;  // (g)                선택

    public NutritionFacts(int servingSize, int servings) {
	this(servingSize, servings, 0);
    }

    public NutritionFacts(int servingSize, int servings,
			  int calories) {
	this(servingSize, servings, calories, 0);
    }

    public NutritionFacts(int servingSize, int servings,
			  int calories, int fat) {
	this(servingSize, servings, calories, fat, 0);
    }

    public NutritionFacts(int servingSize, int servings,
			  int calories, int fat, int sodium) {
	this(servingSize, servings, calories, fat, sodium, 0);
    }

    public NutritionFacts(int servingSize, int servings,
			  int calories, int fat, int sodium,
			  int carbohydrate) {
	this.servingSize = servingSize;
	this.servings = servings;
	this.calories = calories;
	this.fat = fat;
	this.sodium = sodium;
	this.carbohydrate = carbohydrate;
    }
}



NutritionFacts cocaCola = new NutritionFacts(240, 8, 100, 3, 35, 27);
