SUMMARY = "OpenBMC fan control"
DESCRIPTION = "OpenBMC fan control."
PR = "r1"

inherit skeleton-python

RDEPENDS_${PN} += "\
        python-dbus \
        python-pygobject \
        pyphosphor \
        "
SKELETON_DIR = "pyfanctl"
