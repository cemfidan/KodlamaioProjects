
public class TeacherCreditManager extends BaseCreditManager{

	@Override
	public double calculate(double price) {
		return price * 1.20;
	}

}
