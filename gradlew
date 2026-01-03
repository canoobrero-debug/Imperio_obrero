#!/usr/bin/env sh

# Imperio Cosmo - Lanzador de Compilación
APP_NAME="Gradle"
APP_BASE_NAME=$(basename "$0")

# Intentar localizar el binario de Java
if [ -n "$JAVA_HOME" ] ; then
    JAVACMD="$JAVA_HOME/bin/java"
else
    JAVACMD="java"
fi

if [ ! -x "$JAVACMD" ] ; then
    die "ERROR: JAVA_HOME is set to an invalid directory: $JAVA_HOME"
fi

# Configuración de la memoria para Gigio/Compilador
DEFAULT_JVM_OPTS='"-Xmx1024m"'

# Ejecución del Wrapper
exec "$JAVACMD" $DEFAULT_JVM_OPTS -classpath "$ROOT/gradle/wrapper/gradle-wrapper.jar" org.gradle.wrapper.GradleWrapperMain "$@"
