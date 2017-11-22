/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.problema2;

/**
 *
 * @author lam_m
 */
public class ImplArrayManipulator<E> implements ArrayManipulator<E>{

    @Override
    public int subsets(List<E> set) {
        generate(set.size(),set);
               
        
        
        return 1;
    }
    
    private void generate(int tamaño, List lista){
        System.out.print("[");
        if(tamaño == 1){
            System.out.print(lista.get(0));
        }
        else{
            for(int i =0;i<tamaño-1;i++){
                generate(tamaño-1,lista);
                if(tamaño >2){
                    Object tmp = lista.get(i);
                    lista.set(i-1, lista.get(i));
                    lista.set(i, tmp);
                }else{
                    Object tmp = lista.get(0);
                    lista.set(0, lista.get(tamaño-1));
                    lista.set(tamaño-1, tmp);
                }
                        
            }
            generate(tamaño-1,lista);
            
        }
            
        
    }
    
}
