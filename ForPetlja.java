private void btnCuraActionPerformed(java.awt.event.ActionEvent evt) {                                        
         ObradaCura oc = new ObradaCura();
       for(int i=0;i<1818;i++){
           oc.setNew();
           oc.setPodaci(19.1f, "hehe", 19.1f, "hehe");
           try {
                oc.create();
           } catch (Exception ex) {
                System.out.println(ex.getMessage());
           }
       }
    }              
