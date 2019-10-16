package br.com.drummond.resources;


	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class AplicationAc2 {


			@RequestMapping(value="/api2/{valor1}",method= RequestMethod.GET)
			public String api2(@PathVariable Integer valor1){

			     Integer resultado;
			     resultado =valor1%10;
			     if(resultado==0)
			     {
			    	 return "Sim";
			     }
			     else
			     {
			    	return "Não";
			     }
			    
			}
		}

