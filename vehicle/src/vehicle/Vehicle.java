package vehicle;

class Vehicle {
	private double load;
	private double maxLoad;
	public Vehicle(double max_load){
		this.maxLoad = this.kiloToNewts(max_load);
	}
	public double getLoad(){
		return this.newtsToKilo(this.load);
	}
	public double getMaxLoad(){
		return this.newtsToKilo(this.maxLoad);
	}
	public boolean addBox(double weight){
		if(this.kiloToNewts(weight)+this.load <= this.maxLoad){
			this.load += this.kiloToNewts(weight);
			return true;
		} else {
			return false;
		}
	}
	private double kiloToNewts(double weight){
		return (weight*9.8);
	}
	private double newtsToKilo(double weight){
		return (weight/9.8);
	}
}
