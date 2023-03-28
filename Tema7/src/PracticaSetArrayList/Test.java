package PracticaSetArrayList;

import PracticaSetArrayList.TipoArmadura.Zona;

public class Test {

	public static void main(String[] args) {
		PersonajeHS pHS = new PersonajeHS("Yoto Hime", 100, 25);
		PersonajeAL pAL = new PersonajeAL("Kurumi", 90, 100);
		PersonajeTS pTS = new PersonajeTS("Feria Shen", 150, 10);
		
		/*
		 *creacion de armaduras 
		 */
		
		TipoArmadura casco1 = new TipoArmadura("casco de cuero", Zona.CABEZA, 10, 5);
		TipoArmadura casco2 = new TipoArmadura("Casco de hierro", Zona.CABEZA, 20, 10);
		TipoArmadura peto1 = new TipoArmadura("Peto de cuero", Zona.TORSO, 15, 8);
		TipoArmadura peto2 = new TipoArmadura("Peto de hierro", Zona.TORSO, 40, 15);
		TipoArmadura anillo1 = new TipoArmadura("Anillo común dorado", Zona.BRAZOIZQ, 5, 10);
		TipoArmadura anillo2 = new TipoArmadura("Anillo de roca", Zona.BRAZOIZQ, 20, 20);
		TipoArmadura bracalete1 = new TipoArmadura("Bracalete de plomo",Zona.BRAZODER,30,10);
		
		/*
		 * LISTAR HS
		 */
		System.out.println("Listar de personajeHS\n----------------");
		pHS.addArmadura(casco1);
		pHS.addArmadura(casco2);
		pHS.addArmadura(peto1);
		pHS.addArmadura(bracalete1);
		pHS.addArmadura(anillo1);
		
		System.out.println("por defecto");
		pHS.listarArmaduraCreacion();
		System.out.println("-----------------");
		
		System.out.println("por fisico");
		pHS.listarDanioFisico();
		System.out.println("-----------------");
		
		System.out.println("por magico");
		pHS.listarDanioMagico();
		System.out.println("-----------------");
		
		System.out.println("por zona");
		pHS.listarZona();
		System.out.println("-----------------");
		
		System.out.println("por nombre");
		pHS.listarNombre();
		System.out.println("-----------------");
		System.out.println("");
		
		/*
		 * LISTAR AL
		 */
		System.out.println("Listar personajeAL");
		System.out.println("-----------------");
		
		pAL.addArmadura(casco1);
		pAL.addArmadura(casco2);
		pAL.addArmadura(peto1);
		pAL.addArmadura(bracalete1);
		pAL.addArmadura(anillo1);
		
		System.out.println("por defecto");
		pAL.listarCreacion();
		System.out.println("-----------------");
		
		System.out.println("por fisico");
		pAL.listarFisico();
		System.out.println("-----------------");
		
		System.out.println("por magico");
		pAL.listarMagico();
		System.out.println("-----------------");
		
		System.out.println("por zona");
		pAL.listarZona();
		System.out.println("-----------------");
		
		System.out.println("por nombre");
		pAL.listarNombre();
		System.out.println("-----------------");
		System.out.println("");
		
		/*
		 * LISTAR TS
		 */
		System.out.println("Listar de personajeTS\n----------------");
		pTS.addArmadura(casco1);
		pTS.addArmadura(casco2);
		pTS.addArmadura(peto1);
		pTS.addArmadura(bracalete1);
		pTS.addArmadura(anillo1);
		
		System.out.println("por defecto");
		pTS.listarCreacion();
		System.out.println("-----------------");
		
		System.out.println("por fisico");
		pTS.listarDanioFisico();
		System.out.println("-----------------");
		
		System.out.println("por magico");
		pTS.listarDanioMagico();
		System.out.println("-----------------");
		
		System.out.println("por zona");
		pTS.listarZona();
		System.out.println("-----------------");
		
		System.out.println("por nombre");
		pTS.listarNombre();
		System.out.println("-----------------");
		System.out.println("");
	}

}
