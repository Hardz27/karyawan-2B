public class Karyawan{
	final String namaPerusahaan = "XYZ";
	public String nama;
	private String jabatan;
	public String alamat;
	private int gaji;
	private int maxGaji;

	public void setNama(String newNama){
		nama = newNama;
	}
	
	public void setJabatan(String newJabatan){
		jabatan = newJabatan;
	}
	public String getJabatan(){
		return jabatan;
	}

	public void setAlamat(String newAlamat){
		alamat = newAlamat;
	}

	public void setMaxGaji(int newMaxGaji){
		maxGaji = newMaxGaji;
	}
	public int getMaxGaji(){
		return maxGaji;
	}


	public void setGaji(int newGaji){
		if (newGaji > maxGaji) {
			System.out.println("Gaji di set : " + newGaji);
			System.out.println("Max Gaji : " + maxGaji);
			System.out.println("Gaji melebihi batas!");
		}
		else{
			gaji = newGaji;
		}
	}

	public void setGaji(int newGaji, String pesan){
		if (newGaji > maxGaji) {
			System.out.println("Gaji di set : " + newGaji);
			System.out.println("Max Gaji : " + maxGaji);
			System.out.println("Gaji melebihi batas!");
		}
		else{
			System.out.println("Pesan : " + pesan);
			gaji = newGaji;
		}
	}

	public int getGaji(){
		return gaji;
	}	

	public void showBio(){
		System.out.println("Nama perusahaan : " + namaPerusahaan);
		System.out.println("Nama karyawan : " + nama);
		System.out.println("Jabatan : " + getJabatan());
		System.out.println("Alamat : " + alamat);
		System.out.println("Gaji : " + getGaji());
	}
}