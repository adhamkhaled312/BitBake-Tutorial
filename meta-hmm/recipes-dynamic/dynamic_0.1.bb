DESCRIPTION="build my custom heap memory manager as a shared library"
PR="r1"

SRCDIR="${TOPDIR}/../meta-hmm/source"

do_build(){
    gcc -c -fPIC ${SRCDIR}/hmm.c -o ${SRCDIR}/hmmdyn.o
    gcc -c -fPIC ${SRCDIR}/list.c -o ${SRCDIR}/listdyn.o
    gcc -shared -o ${SRCDIR}/libhmm.so ${SRCDIR}/listdyn.o ${SRCDIR}/hmmdyn.o

}

