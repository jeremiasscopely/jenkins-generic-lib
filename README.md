
### Pattern names

Importante usar un patron en la nomenclatura de los archivos en la carpeta vars.

Sugerencia:
    prefix de la Library + _ + prefix del tipo del archivo + _ + complemento
    EJ: 
        glib_pip_android
    Tipos de los archivos
      Method = mtd
      Pipeline = pip
      Switch  = sch
      ...
    Ventajas
      Organiozacion visual para el uso externo y organizacao en la visualizacao de los archivos en el projecto de la libraria. 

### Evaluar el uso de scripted pipelines en caso excepcionales
    EJ: vars\dice_clean_agents.groovy
    Tenemos una pipeline creada que podria tornar un compoente y no es: https://issues.jenkins.io/browse/JENKINS-62127

### Docs
1. Jenkins shared libraries documentation: 
    - https://www.jenkins.io/doc/book/pipeline/shared-libraries/
2. Call python scripts from Jenkins pipeline
    - https://www.youtube.com/watch?v=OB7fGZ32n-s
    - https://github.com/darinpope/jenkins-example-scripts-python
3. Repo with multiple examples of shared libraries scripts to see 