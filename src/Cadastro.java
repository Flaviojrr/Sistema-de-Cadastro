public class Cadastro implements TAD {
    User usuarios[] = new User[10];
    private int cont=0;

    @Override
    public String adicionarUser(String nome, String senha, String email){
        for (int i=0;i<usuarios.length;){
            if(usuarios[i]==null){
                usuarios[i]= new User(nome,senha,email);
                cont++;
                return "Cadastro realizado com sucesso!!!";
            }else if (cont==10){
                return "Banco e usuarios cheio!!!";
            }
            i++;
        }
        return null;
    }

    @Override
    public boolean login(String nome, String senha) {
        try {
            for(int i=0;i<usuarios.length;i++){
                if(usuarios[i].getNome().equals(nome)){
                    if(usuarios[i].getSenha().equals(senha)){
                        return true;
                    }
                }
            }
        }catch (Exception e){
            return false;
        }
        return false;
    }
}

