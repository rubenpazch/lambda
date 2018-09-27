package FunctionalInterfaces.Entities;

import FunctionalInterfaces.Data.DataSource;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Congress congres  = DataSource.listCongress();
		congres.sortByLastName();
		
		System.out.println(congres);
		
	}

}
