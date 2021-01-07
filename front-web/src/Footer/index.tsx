import './styles.css';
import { ReactComponent as YoutubeIcon } from './youtube.svg';
import { ReactComponent as InstagramIcon } from './instagram.svg';
import { ReactComponent as LinkedinIcon } from './linkedin.svg';


function Footer() {
    return (
        <footer className="main-footer">
            <p>App desenvolvido durante a 2ª ed. do evento Semana DevSuperior</p>
            <div className="footer-icons">
                <a href="#" target="_new">
                    <YoutubeIcon />
                </a>
                <a href="#" target="_new">
                    <InstagramIcon />
                </a>
                <a href="#" target="_new">
                    <LinkedinIcon />
                </a>
            </div>
        </footer>
    )
}

export default Footer;