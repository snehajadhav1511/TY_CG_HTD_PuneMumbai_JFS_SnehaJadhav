
public class Van {
	public static Van ref= new Van();

	private Van(){

	}

	public static Van getVan() {
		return ref;
	}
}

