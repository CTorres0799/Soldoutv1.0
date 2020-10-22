
package Metodos;


import javax.swing.JProgressBar;

public class loadingBar extends Thread{
 
JProgressBar loading;

public loadingBar (JProgressBar loading){
    
    super();
    this.loading = loading;
}

public void run() {
    for (int c = 0; c <= 100; c++) 
    {
     loading.setValue(c);
     pausa(80);
    }
}

public void pausa(int mlseg ){
    
    try {
        Thread.sleep(mlseg);
    } catch (Exception e) {
    }
}

}
