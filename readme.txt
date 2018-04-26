Se anexa la explicacion del diagrama:
Para la realizacion de las tareas se opto por utilizar el Command Pattern para que los robots no tuvieran informacion
innecesaria para la realizacion de las tareas, por lo tanto cada robot tendra un control el cual se encargara de procesar
las tareas que se encuentren en la lista.

Para la logica de la lista, desde el main/cliente se carga la lista el cual se le envia a los robots y con esta informacion'
se pasa el contenido de la lista para que se encargue de llenar la lista de los comandos.

Para la paralelizacion de los robots cada robot corre el metodo do tasks el cual corre run y dentro se planeo implementar
la logica para correr cada comando.