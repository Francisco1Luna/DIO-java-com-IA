package br.com.dio.POO.exercicios.exercicio3;

public class MaquinaBanho {

    private int litrosAgua;
    private int litrosShampoo;
    private boolean ocupada;
    private boolean precisaSerLimpa;
    private Pet petNoBanho;

    public MaquinaBanho() {
        this.litrosAgua = 0;
        this.litrosShampoo = 0;
        this.ocupada = false;
        this.precisaSerLimpa = false;
    }

    public int getLitrosAgua() {
        return litrosAgua;
    }

    public void setLitrosAgua(int litrosAgua) {
        this.litrosAgua = litrosAgua;
    }

    public int getLitrosShampoo() {
        return litrosShampoo;
    }

    public void setLitrosShampoo(int litrosShampoo) {
        this.litrosShampoo = litrosShampoo;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public boolean isPrecisaSerLimpa() {
        return precisaSerLimpa;
    }

    public void setPrecisaSerLimpa(boolean precisaSerLimpa) {
        this.precisaSerLimpa = precisaSerLimpa;
    }

    //metodos de checagem

    public void checarAgua() {
        System.out.println(this.getLitrosAgua());
    }

    public void checarShampoo() {
        System.out.println(this.getLitrosShampoo());
    }

    public void checarPetNoBanho() {
        if (this.isOcupada() && this.petNoBanho != null) {
            System.out.println(this.petNoBanho.getNomePet() + " esta no banho");
        } else {
            System.out.println("Nenhnum pet esta no banho");
        }
    }

    //metodos responsaveis pelo banho
    public void colocarPet(Pet pet) {
        if (!this.isOcupada() && !this.precisaSerLimpa) {
            if (pet != null && !pet.isLimpo()) {
                this.setOcupada(true);
                this.petNoBanho = pet;
            } else {
                System.out.println("O pet precisa existir e estar sujo");
            }
        } else {
            System.out.println("A maquina precisa estar vazia e limpa");
        }
    }

    public void darBanho() {
        if (this.isOcupada() && !this.precisaSerLimpa) {
            if (this.litrosAgua >= 10 && this.litrosShampoo >= 2) {
                this.petNoBanho.setLimpo(true);
                this.litrosShampoo -= 2;
                this.litrosAgua -= 10;
            } else {
                System.out.println("A maquina deve ter agua e shampoo");
            }
        } else {
            System.out.println("A maquina precisa estar ocupada e limpa");
        }
    }

    public void removerPet() {
        if (this.isOcupada()) {

            if (!this.petNoBanho.isLimpo()) {
                this.setPrecisaSerLimpa(true);
            }

            this.setOcupada(false);
            this.petNoBanho = null;
        }
    }


    //metodos de abastecimento/preparativos

    public void abastecerAgua(int quantidadeLitros) {
        if (this.litrosAgua + quantidadeLitros <= 30) {
            int valorMaximo = this.litrosAgua - quantidadeLitros;
            this.litrosAgua += quantidadeLitros;
        } else {
            System.out.println("A maquina ja esta na capacidade maxima");
        }
    }

    public void abastecerShampoo(int quantidadeLitros) {
        if (this.litrosShampoo + quantidadeLitros <= 10) {
            int valorMaximo = this.litrosShampoo - quantidadeLitros;
            this.litrosShampoo += quantidadeLitros;
        } else {
            System.out.println("A maquina ja esta na capacidade maxima");
        }
    }

    public void limparMaquina() {
        if (this.litrosAgua >= 3 && this.litrosShampoo >=1) {
            this.setPrecisaSerLimpa(false);
            this.litrosAgua -= 3;
            this.litrosShampoo -= 1;
        } else {
            System.out.println("Agua/Shampoo insuficiente para lavar a maquina");
        }
    }

}
