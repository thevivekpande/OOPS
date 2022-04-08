package factoryPattern;

interface BollyWoodMovie{
	public String MovieName();
}

class BollywoodActionMovie implements BollyWoodMovie{
	private final String movieName;
	public BollywoodActionMovie(){
		this.movieName="BollyWoodAction";
	}

	@Override
	public String MovieName() {
		// TODO Auto-generated method stub
		return movieName;
	}
	
}

class BollywoodComedyMovie implements BollyWoodMovie{
	private final String movieName;
	public BollywoodComedyMovie(){
		this.movieName="BollyWoodAction";
	}
	
	@Override
	public String MovieName() {
		// TODO Auto-generated method stub
		return movieName;
	}
	
}


interface TollyWoodMovie{
	public String MovieName();
}

class TollyWoodActionMovie implements TollyWoodMovie{
	private final String movieName;
	
	public TollyWoodActionMovie(){
		this.movieName="TollywoodActionMovie";
	}
	@Override
	public String MovieName() {
		// TODO Auto-generated method stub
		return movieName;
	}
	
}

class TollyWoodComedyMovie implements TollyWoodMovie{
	private final String movieName;
	
	public TollyWoodComedyMovie() {
		movieName="TollywoodComedyMovie";
	}
	@Override
	public String MovieName() {
		// TODO Auto-generated method stub
		return movieName;
	}
	
}
interface IMovieFactory{
	public TollyWoodMovie GetTollyWoodMovie();
	public BollyWoodMovie GetBollyWoodMovie();
}

class ActionMovieFactory implements IMovieFactory{
	
	public ActionMovieFactory(){
		
	}

	@Override
	public TollyWoodMovie GetTollyWoodMovie() {
		// TODO Auto-generated method stub
		return new TollyWoodActionMovie();
	}

	@Override
	public BollyWoodMovie GetBollyWoodMovie() {
		// TODO Auto-generated method stub
		return new BollywoodActionMovie();
	}
	
}

class ComedyMovieFactory implements IMovieFactory{
	
	public ComedyMovieFactory() {
		
	}
	
	@Override
	public TollyWoodMovie GetTollyWoodMovie() {
		// TODO Auto-generated method stub
		return new TollyWoodComedyMovie();
	}

	@Override
	public BollyWoodMovie GetBollyWoodMovie() {
		// TODO Auto-generated method stub
		return new BollywoodComedyMovie();
	}
	
}
public class AbstractFactoryPatternEx {
	
	AbstractFactoryPatternEx(){
		IMovieFactory movie=new ActionMovieFactory();
		BollyWoodMovie bollywoodMovie=movie.GetBollyWoodMovie();
		
		System.out.println(bollywoodMovie.MovieName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractFactoryPatternEx a=new AbstractFactoryPatternEx();

	}

}
