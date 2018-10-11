public class Perusahaan{
	public static void main(String[] args) {
		ProjectManager pm = new ProjectManager();
		pm.setNama("Mahmud");
		pm.setJabatan("Project Manager");
		pm.setAlamat("Jalan kebayoran lama no.21");
		pm.setMaxGaji(100);
		pm.setGaji(98);

		pm.showBio();
		System.out.println();

		Programmer pro = new Programmer();
		pro.setNama("Hardianz");
		pro.setJabatan("Programmer");
		pro.setAlamat("Jalan kebayoran baru no.7");
		pro.setMaxGaji(90);
		pro.setGaji(90, "Karna Lembur saya kasih anda gaji maksimal");

		pro.showBio();
		System.out.println();

		Designer des = new Designer();
		des.setNama("Karlin");
		des.setJabatan("Designer");
		des.setAlamat("Jalan Raya sudah terlanjur lama no.313");
		des.setMaxGaji(70);
		des.setGaji(61);
		des.setGaji(70);
		des.setGaji(100);
		des.setGaji(69);

		des.showBio();
		System.out.println();




	}

}